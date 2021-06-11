import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class user_page {
    public JPanel userPageFrame;
    public JPanel subFrame;
    private JButton mondayButton;
    private JButton tuesdayButton;
    private JButton wednesdayButton;
    private JButton thursdayButton;
    private JButton fridayButton;

    private JFrame f;

    public user_page() {
        mondayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 f = new JFrame();
                JOptionPane.showMessageDialog(f,"Hurray!! No Lectures on Monday's!!");
            }
        });
        fridayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f = new JFrame();
                JOptionPane.showMessageDialog(f, "Hurray!! No Lectures on Fridays!!");
            }
        });
        tuesdayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f = new JFrame();
                JOptionPane.showMessageDialog(f,"7am - 10am : Computer Networks (CPS 216) with Mr. Bansah\n" +
                                                        "11am - 2pm : VB.NET (CPS 212) with Mr. Dzata");
            }
        });
        wednesdayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f = new JFrame();
                JOptionPane.showMessageDialog(f,"7am - 10am : IT Project Management (CPS 220) with Mrs. Dorothy\n" +
                                                        "11am - 2pm : Research Methodology (CPS 212) with Dr. Asabre\n" +
                                                        "2pm - 5pm : Web Tech II (CPS 218) with Mr. Torgbui");
            }
        });
         thursdayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f = new JFrame();
                JOptionPane.showMessageDialog(f,"12pm - 2pm : Database Tech (CPS 206) with Mr. Torgbui");
            }
        });

    }}

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("user_page");
//        frame.setContentPane(new user_page().userPageFrame);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }
//}
