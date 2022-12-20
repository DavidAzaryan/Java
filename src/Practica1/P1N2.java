package Practica1;
import java.util.Scanner;


public class P1N2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] mas = new int [6];
        int sum = 0;

        System.out.println("Enter a number: ");
        int i = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(i <= 4){
            i++;
            mas[i]= sc.nextInt();
            sum += mas[i];
            if(mas[i] > max){
                max = mas[i];
            }
            if(mas[i]< min){
                min = mas[i];
            }
        }
        int y = 0;
        do {
            y++;
            System.out.print (mas[y]);
        }
        while(y <= 4);
        System.out.println("\nsum = " + sum);
        System.out.println("max =" + max);
        System.out.println("min =" + min);
    }
}
