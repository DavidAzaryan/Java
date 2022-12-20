package Practica3.P3N6;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cur= "";
        System.out.println("USD- USA dollar\nEUR- euro\nAMD- armenian dram");
        while(!(cur.equals("usd")|cur.equals("eur")|cur.equals("amd"))) {
            System.out.print("Enter the currency you want to convert to: ");
            cur = input.nextLine();
            if(!(cur.equals("usd")|cur.equals("eur")|cur.equals("amd")))
                System.out.println("Unknown currency.");
        }
        System.out.print("How much you want to convert: ");
        double money = input.nextDouble();
        double result;
        if (cur.equals("usd")) {
            result = money * 0.016;
            System.out.print(money + "₽ is " + result + "$");
        }
        if (cur.equals("eur")) {
            result = money * 0.018;
            System.out.print(money + "₽ is " + result + "€");
        }
        if (cur.equals("amd")) {
            result = money * 6.34;
            System.out.print(money + "₽ is " + result + "֏");
        }
    }
}
