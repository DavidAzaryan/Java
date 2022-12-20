package Practica1;
import java.util.Scanner;
import java.util.Formatter;

public class P1N4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Formatter fmt = new Formatter();
        fmt.format("harmonic series: \n %s, %s,%s,%s,%s,%s,%s,%s,%s,%s", "1", "1/2", "1/3", "1/4", "1/5", "1/6", "1/7", "1/8", "1/9", "1/10");
        System.out.print(fmt);
    }
}