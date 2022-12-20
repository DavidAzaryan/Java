package Practica5.N3;
import javax.swing.*;
import java.awt.*;

public class Tester
{
    public static void main(String args[])
    {
        String[] strings = new String[1];
        strings[0] = "E:\\David\\picture.PNG";

        Image bgImage= Toolkit.getDefaultToolkit().getImage(strings[0]);
        JLabel jLabel = new JLabel(new ImageIcon(bgImage));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.GRAY);
        mainPanel.add(jLabel);

        JFrame frame = new JFrame("JFrame");
        frame.setPreferredSize(new Dimension(500,700));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

}