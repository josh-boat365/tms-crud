import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class create_account<conn> {
    private JTextField userNameField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JTextField contactField;
    private JButton loginButton;
    public JPanel mainFrame;

    private  String username;
    private String email;
    private char[] password;
    private String contact;
    private  JFrame f;


    public create_account(){
        loginButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username = userNameField.getText();
                email = emailField.getText();
                password = passwordField.getPassword();
                contact = contactField.getText();

                connDB conn = new connDB();

                try {
                conn.conn.createStatement().executeUpdate(
                        "insert into users (username, password, email, contact) " +
                                "values ( '" + username + "', '"+ password + "', '" + email + "', '" + contact + "' )"
                );
                    System.out.println("Insert into db Successfully!");


                }catch (SQLException err){
                    System.out.println("error during update: " + err.getMessage());
                }

              f = new JFrame();
               JOptionPane.showMessageDialog(f,"Account Created Successfully!");



            }
        });
    }


//    public static void main(String[] args) {
////        JFrame frame = new JFrame("crud");
////        frame.setContentPane(new create_account().mainFrame);
////        frame.setLocationRelativeTo(null);
////        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
////        frame.pack();
////        frame.setVisible(true);
//    }
}
