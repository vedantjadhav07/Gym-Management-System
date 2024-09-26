package gym_management_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class login_page extends MouseAdapter implements ActionListener {
    JFrame f1;

    // Frame 1{Login page} components
    JTextField usertext;
    JPasswordField passtext;
    JButton submit, cancel;
    JLabel welcome, username, password, lock1;
    GridBagConstraints gck = new GridBagConstraints();
    GridBagLayout gb = new GridBagLayout();

    public login_page() {
        f1 = new JFrame();
        f1.setVisible(true);
        f1.setSize(800, 500);
        f1.setLayout(gb);
        f1.setTitle("Login Page");
        f1.setLocation(297, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);  // Center the frame on the screen

        // Welcome Label
        welcome = new JLabel("Welcome to Fitness Point");
        welcome.setForeground(Color.RED);
        welcome.setFont(new Font("Arial", Font.BOLD, 16));
        gck.gridx = 0;
        gck.gridy = 0;
        gck.ipadx = 10;
        gck.ipady = 10;
        gck.gridwidth = 3;
        gb.setConstraints(welcome, gck);
        f1.add(welcome);

        // Load the image (Ensure the image is in the correct directory)
        ImageIcon lock = new ImageIcon(getClass().getResource("/gym_management_system/lock.jpg"));
        lock1 = new JLabel(lock);
        gck.gridx = 3;
        gck.gridy = 0;
        gck.gridheight = 3;
        gb.setConstraints(lock1, gck);
        f1.add(lock1);
        gck.gridheight = 1;  // Reset gridheight

        // Username Label
        username = new JLabel("Username");
        username.setForeground(Color.BLUE);
        username.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        gck.gridx = 0;
        gck.gridy = 1;
        gck.gridwidth = 1;
        gb.setConstraints(username, gck);
        f1.add(username);

        // Username Text Field
        usertext = new JTextField(10);
        gck.gridx = 1;
        gck.gridy = 1;
        gb.setConstraints(usertext, gck);
        f1.add(usertext);

        // Password Label
        password = new JLabel("Password");
        password.setForeground(Color.BLUE);
        password.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        gck.gridx = 0;
        gck.gridy = 2;
        gb.setConstraints(password, gck);
        f1.add(password);

        // Password Text Field
        passtext = new JPasswordField(10);
        gck.gridx = 1;
        gck.gridy = 2;
        gb.setConstraints(passtext, gck);
        f1.add(passtext);

        // Submit Button
        submit = new JButton("Submit");
        submit.addActionListener(this);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        gck.gridx = 0;
        gck.gridy = 3;
        gb.setConstraints(submit, gck);
        f1.add(submit);

        // Cancel Button
        cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        gck.gridx = 1;
        gck.gridy = 3;
        gb.setConstraints(cancel, gck);
        f1.add(cancel);
    }

    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if (msg.equals("Submit")) {
            String un = usertext.getText();
            String ps = new String(passtext.getPassword());  // Use getPassword() for security
            if (un.equals("GYM") && ps.equals("vedant07")) {
                new home_page();  // Assuming home_page is another frame
                usertext.setText("");
                passtext.setText("");
            } else {
                JOptionPane.showMessageDialog(f1, "Please enter a valid username and password", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (msg.equals("Cancel")) {
            f1.dispose();
        }
    }

    public static void main(String[] args) {
        new login_page();
    }
}
