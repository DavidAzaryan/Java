package Practica6.N2;
import javax.swing.*;
import java.awt.*;

import java.util.Timer;
import java.util.TimerTask;

public class Run extends TimerTask {

    public void run(){
        JFrame frame = new JFrame();
        frame.setBounds(250,150,900,900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new Draw());
        frame.setVisible(true);
        try {
            Thread.sleep(600);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        frame.setVisible(false);

    }
    public static void main(String args[]) throws Exception{
        TimerTask timerTask = new Run(); //reference created for TimerTask class
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10); // 1.task 2.delay 3.period
        Thread.sleep(6000);
        timer.cancel();
    }

}