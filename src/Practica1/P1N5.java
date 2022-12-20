package Practica1;
import java.util.Scanner;

public class P1N5 {
    int x;
    int fac;

    public void Factorial(){
        fac = 1;
        for(int i = 1; i != x+1; i++){
            fac = fac*i;
        }
        //return fac;
    }
    public void start(){
        System.out.print("Enter a number: \n");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        Factorial();
        System.out.println(fac);
    }
}
