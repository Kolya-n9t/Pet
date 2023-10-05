package LogSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame jFrame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasportField = new JPasswordField();
    JLabel userIdLabel = new JLabel("UserId:");
    JLabel userPassLabel = new JLabel("Password");
    JLabel message = new JLabel();



    HashMap<String,String> loginInfoOriginal;

    public LoginPage(HashMap<String, String> loginInfoOriginal) {
        this.loginInfoOriginal = loginInfoOriginal;
        userIdLabel.setBounds(50,100, 75,25);
        userPassLabel.setBounds(50,150, 75, 25);
        message.setBounds(125,200,100,25);
        message.setFont(new Font(null, Font.ITALIC,25));
        userIdField.setBounds(125,100,200,25);
        userPasportField.setBounds(125,150,200,25);
        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        resButton.setBounds(225,200,100,25);
        resButton.setFocusable(false);
        resButton.addActionListener(this);

        jFrame.add(userIdLabel);
        jFrame.add(userPassLabel);
        jFrame.add(userIdField);
        jFrame.add(userPasportField);
        jFrame.add(loginButton);
        jFrame.add(resButton);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(420,420);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resButton){
           userIdField.setText("");
           userPasportField.setText("");
        }
        if (e.getSource() == loginButton){
            String userId = userIdField.getText();
            String userPasport = String.valueOf(userPasportField.getPassword());
            if(loginInfoOriginal.containsKey(userId)){
                if (loginInfoOriginal.get(userId).equals(userPasport)){
                    message.setForeground(Color.GREEN);
                    message.setText("Login successful");
                    WelcomePage welcomePage = new WelcomePage();
                    jFrame.dispose();
                }else {
                    message.setForeground(Color.RED);
                    message.setText("Wrong password");
                }
            }else {
                message.setForeground(Color.RED);
                message.setText("Username not found");
            }
        }
    }
}
