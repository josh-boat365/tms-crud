import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class home {
    private JPanel homeMainFrame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton createAccountButton;
    private Connection conn;

    private  String username;
    private String password = "";
    private  JFrame f;

    public home() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username = usernameField.getText();

                for (char c :  passwordField.getPassword()) password += c;

                connDB conn = new connDB();

                try {
                    ResultSet query =
                    conn.conn.createStatement().executeQuery(
                            "select * from users where username='"+username+"' and password='"+password+"'");

                    if (query.next()){
                        f = new JFrame();
                        System.out.println("auth success");
                        JOptionPane.showMessageDialog(f,"Login Successful!");


                        JFrame frame = new JFrame("User's Page");
                        frame.setContentPane(new user_page().userPageFrame);
                        frame.setLocationRelativeTo(null);
                        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        frame.pack();
                        frame.setVisible(true);
                    }else {
                        System.out.println("Invalid ");
                        JOptionPane.showMessageDialog(f,"Invalid Username or Password!!");
                    }

                }catch (SQLException err){
                    System.out.println("Error!!"+ err);
                }

            }
        });
        createAccountButton.addActionListener(new ActionListener() { //display create account frame onclick
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Create Account Page");
                frame.setContentPane(new create_account().mainFrame);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("home");
        frame.setContentPane(new home().homeMainFrame);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
