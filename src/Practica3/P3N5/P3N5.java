package Practica3.P3N5;

import java.util.Scanner;

public class P3N5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dob = Double.valueOf(10);
        System.out.println(dob);
        double str = Double.parseDouble("12");
        System.out.println(str);
        byte v = (byte)str;
        int i = (int)str;
        long l = (long)str;
        short s = (short)str;
        float f = (float)str;
        char c = (char)str;
        System.out.println(str);
        double pi = 3.14;
        String p = Double.toString(pi);
        System.out.println(p);
    }
}
