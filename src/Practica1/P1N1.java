package Practica1;
import java.util.Scanner;


public class P1N1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] mas = new int [5];
        int sum = 0;
        int ar;
        System.out.print("Enter a number: \n");
        for(int i = 0; i < 5 ; i++){
            mas[i]= sc.nextInt();
            sum += mas[i];
        }
        ar = sum/mas.length;
        for(int i = 0; i < 5 ; i++){
            System.out.print (mas[i]);
        }
        System.out.println("\n sum = " + sum);
        System.out.println("\n ar = " + ar);
    }
}
