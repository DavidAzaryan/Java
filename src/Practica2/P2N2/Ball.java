package Practica2.P2N2;

import java.util.Scanner;

public class Ball {
    private double x;
    private double y;
    private double MoveX;
    private double MoveY;
    Scanner source = new Scanner(System.in);

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setX(){this.x = x;}
    public double getX(){return x;}
    public void setY(){this.y = y;}
    public double getY(){return y;}
    public void setXY(){this.x = x; this.y = y;}
    public void Move(){
        System.out.print("\nНа сколько переместить: ");
        MoveX = source.nextDouble();
        MoveY = source.nextDouble();
        x = x + MoveX;
        y = y + MoveY;
        System.out.print("x = " + getX() + "\n" + "y = " + getY());
    }
}
