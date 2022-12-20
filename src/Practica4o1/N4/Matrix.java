package Practica4o1.N4;


public class Matrix {
    private int[][] matrix1;
    private int[][] matrix2;
    private int number;
    public static void Add(int[][] matrix1, int[][] matrix2){
        int [][] matrixResult = new int[matrix1.length][matrix2[0].length];
        for(int i = 0; i < matrix1[0].length; i++){
            for(int j = 0; j < matrix1.length; j++) {
                matrix1[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }
    public static void Multiply(int[][] matrix1, int number){
        for(int i = 0; i < matrix1[0].length; i++){
            for(int j = 0; j < matrix1.length; j++){
                matrix1[i][j] = matrix1[i][j]*number;
            }
        }
    }
    public static void Print(int[][] matrix1){
        for (int[] ints : matrix1) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.printf("%4d\t", ints[j]);
            }
            System.out.println();
        }
    }
}
