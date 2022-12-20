package Practica3.P3N4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class P3N4 {
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        while (n <= 0) {
            System.out.print("Enter value n (n>0): ");
            n = input.nextInt();
            if(n > 0) {
                Random rand = new Random();
                int[] arr = new int[n];
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rand.nextInt(0, n);
                    if (arr[i]%2 == 0)
                        count++;
                }
                int[] even = new int[count];
                int index = 0;
                System.out.println("Your array: " + Arrays.toString(arr));
                if(count != 0) {
                    for (int i : arr) {
                        if (i % 2 == 0) {
                            even[index] = i;
                            index++;
                        }
                    }
                    System.out.println("Even numbers: " + Arrays.toString(even));
                }
                else {
                    System.out.println("There is no even numbers in this array.");
                }
            }
            else {
                System.out.println("Incorrect value, try again");
            }
        }
    }
}