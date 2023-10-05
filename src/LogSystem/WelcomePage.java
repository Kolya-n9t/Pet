package LogSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage implements ActionListener {
    JFrame jFrame = new JFrame();
    JLabel jLabel = new JLabel("Welcome");

    public WelcomePage() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(420,420);
        jFrame.setVisible(true);
        jLabel.setBounds(125,200,100,25);
        jLabel.setFont(new Font(null, Font.ITALIC,25));
        jLabel.setText("Welcome" + );
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
