package Practica4o1.N4;

import java.util.Scanner;

public class MatrixTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Width: ");
        int width = Integer.valueOf(input.nextLine());
        System.out.print("Height: ");
        int height =  Integer.valueOf(input.nextLine());
        int[][] mat1 = new int[height][width];
        int[][] matRes;
        System.out.println("Enter your matrix: ");
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                mat1[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        System.out.println("Your matrix: ");
        Matrix.Print(mat1);
        String command = "";
        while (!command.equals("0")) {
            System.out.print("\nEnter command: ");
            command = input.nextLine();
            switch (command) {
                case ("+"):
                    int[][] mat2 = new int[height][width];
                    System.out.println("Enter second matrix: ");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            mat2[i][j] = Integer.valueOf(input.nextLine());
                        }
                    }
                    System.out.println("Second matrix: ");
                    Matrix.Print(mat2);
                    matRes = mat1;
                    Matrix.Add(matRes, mat2);
                    System.out.println("Result: ");
                    Matrix.Print(matRes);
                    break;

                case ("*"):
                    System.out.print("Enter the number: ");
                    int num = Integer.valueOf(input.nextLine());
                    matRes = mat1;
                    Matrix.Multiply(matRes, num);
                    System.out.println("Result: ");
                    Matrix.Print(matRes);
                    break;
            }
        }
    }
}
