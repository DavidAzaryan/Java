package Practica6.N2;
import javax.swing.*;
import java.awt.*;

public class Tester {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(750,250,900,900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new Draw());
        frame.setVisible(true);
        Draw draw = new Draw();
    }
}
