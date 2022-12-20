package Practica1;
import java.util.Scanner;

public class P1N5 {
    public static void main(String[] args) {
        int x;
        int fac = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = sc.nextInt();
        for (int i = 1; i != x + 1; i++) {
            fac = fac * i;
        }
        System.out.println("Factorial: " + fac);
    }
}
