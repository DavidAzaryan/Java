package Practica5.N2;
import Practica4o1.N8.Circle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class DrawShapes extends JPanel {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Random random = new Random();
        int num;
        int count = 0;
        while(count < 20) {
            num = random.nextInt(4);
            switch (num) {
                case 0:
                    Color c1 = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255), 50);
                    g2d.setColor(c1);
                    g2d.fillOval(random.nextInt(200), random.nextInt(200), random.nextInt(600), random.nextInt(getHeight()));
                    count++;
                    continue;

                case 1:
                    Color c2 = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255), 50);
                    g2d.setColor(c2);
                    g2d.fillRect(random.nextInt(300), random.nextInt(300), random.nextInt(600), random.nextInt(getHeight()));
                    count++;
                    continue;

                case 2:
                    Color c3 = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255), 50);
                    g2d.setColor(c3);
                    Polygon polygon = new Polygon();
                    polygon.addPoint(random.nextInt(300), random.nextInt(getHeight()));
                    polygon.addPoint(random.nextInt(600), random.nextInt(getHeight()));
                    polygon.addPoint(random.nextInt(600), random.nextInt(getHeight()));
                    g2d.fillPolygon(polygon);
                    count++;
                    continue;
                case 3:
                    Color c4 = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255), 50);
                    g2d.setColor(c4);
                    Polygon polygon2 = new Polygon();
                    polygon2.addPoint(random.nextInt(getWidth()), random.nextInt(getHeight()));
                    polygon2.addPoint(random.nextInt(getWidth()), random.nextInt(getHeight()));
                    polygon2.addPoint(random.nextInt(getWidth()), random.nextInt(getHeight()));
                    polygon2.addPoint(random.nextInt(getWidth()), random.nextInt(getHeight()));
                    g2d.fillPolygon(polygon2);
                    count++;

                default:

            }
        }
    }

}
