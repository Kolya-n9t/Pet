package StopWatch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopWatch implements ActionListener {
    JFrame jFrame = new JFrame();
    JButton startButton = new JButton("START");
    JButton resetButton = new JButton("RESET");

    JLabel jLabel = new JLabel();

    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;

    boolean started = false;

    String seconds_Str = String.format("%02d", seconds);
    String minutes_Str = String.format("%02d",minutes);;
    String hours_Str = String.format("%02d", hours);;

    Timer timer = new Timer(1000, new ActionListener(){


        public void actionPerformed(ActionEvent e) {
            elapsedTime = elapsedTime+1000;
            hours = (elapsedTime/3600000); ;
            minutes = (elapsedTime/60000)%60; ;
            seconds = (elapsedTime/1000)%60;

            seconds_Str=String.format("%02d", seconds);
            minutes_Str=String.format("%02d", minutes);
            hours_Str=String.format("%02d", hours);


        }
    });

    public StopWatch() {
        jLabel.setText(hours_Str + " : " + minutes_Str + " : " + seconds_Str);
        jLabel.setBounds(100, 100, 230, 100);
        jLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
        jLabel.setBorder(BorderFactory.createBevelBorder(1));
        jLabel.setOpaque(true);
        jLabel.setAlignmentX(JTextField.CENTER);
        jLabel.setBackground(Color.CYAN);

        startButton.setBounds(100, 200,100,50);
        startButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        startButton.setFocusable(false);
        startButton.addActionListener(this);
        startButton.setBackground(Color.GREEN);

        resetButton.setBounds(230, 200,100,50);
        resetButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        resetButton.setBackground(Color.BLUE);

        jFrame.add(startButton);
        jFrame.add(resetButton);
        jFrame.add(jLabel);


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(420, 420);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==startButton){
            if (started==false){
                started=true;
                startButton.setText("STOP");
                start();
            }else{
                started=false;
                startButton.setText("START");
                stop();
            }
        }
        if (e.getSource()==resetButton){
            started=false;
            startButton.setText("START");
            reset();
        }
    }

    public void start(){
        timer.start();
    }

    public void stop(){
        timer.stop();
    }

    public void reset(){
        timer.stop();
        elapsedTime = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        seconds_Str=String.format("%02d", seconds);
        minutes_Str=String.format("%02d", minutes);
        hours_Str=String.format("%02d", hours);
        jLabel.setText(hours_Str + " : " + minutes_Str + " : " + seconds_Str);
    }
}
