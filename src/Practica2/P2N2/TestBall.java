package Practica2.P2N2;

public class TestBall {
    public static void main(String[] args) {
        Ball k1 = new Ball( 1, -2);
        k1.setXY();
        System.out.print("x = " + k1.getX() + "\ny = " + k1.getY());
        k1.Move();
    }
}
