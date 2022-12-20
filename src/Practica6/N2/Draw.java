package Practica6.N2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Draw extends JPanel {

    public void paint(Graphics g) {
        //Scanner input = new Scanner(System.in);
        Graphics2D g2d = (Graphics2D) g;
        Random random = new Random();
        Color c1 = new Color(255, 0, 0, 50);
        Color c2 = new Color(0,0,255, 50);
        g2d.setColor(c1);
        g2d.fillRect(150,150,50,50);
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int count = 0;
        int direction;
        while(count < 900) {
            direction = random.nextInt(8);
            switch (direction) {
                case 0:
                    //ВВЕРХ 1
                    g2d.setColor(c1);
                    y1 += 25;
                    g2d.fillRect(150 + x1, 150 + y1, 50, 50);
                    count++;
                    continue;
                case 1:
                    //ВВЕРХ 2
                    g2d.setColor(c2);
                    y2 += 25;
                    g2d.fillRect(350 + x2, 350 + y2, 50, 50);
                    count++;
                    continue;

                case 2:
                    //ВПРАВО 1
                    x1 += 25;
                    g2d.setColor(c1);
                    g2d.fillRect(150 + x1, 150 + y1, 50, 50);
                    count++;
                    continue;
                case 3:
                    //ВПРАВО 2
                    x2 += 25;
                    g2d.setColor(c2);
                    g2d.fillRect(350 + x2, 350 + y2, 50, 50);
                    count++;
                    continue;

                case 4:
                    //ВЛЕВО 1
                    x1 -= 25;
                    g2d.setColor(c1);
                    g2d.fillRect(150 + x1, 150 + y1, 50, 50);
                    count++;
                    continue;
                case 5:
                    //ВЛЕВО 2
                    x2 -= 25;
                    g2d.setColor(c2);
                    g2d.fillRect(350 + x2, 350 + y2, 50, 50);
                    count++;
                    continue;

                case 6:
                    //ВНИЗ 1
                    y1 -= 25;
                    g2d.setColor(c1);
                    g2d.fillRect(150 + x1, 150 + y1, 50, 50);
                    count++;
                    continue;
                case 7:
                    //ВНИЗ 2
                    y2 -= 25;
                    g2d.setColor(c2);
                    g2d.fillRect(350 + x2, 350 + y2, 50, 50);
                    count++;
            }
        }

    }


}