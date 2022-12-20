package Practica3.P3N1;
import java.util.Arrays;
import java.util.Random;

public class P3N1 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] arr1 = new double[5];
        double[] arr2 = new double[5];
        for(int i=0;i<5; i++)
        {
            arr1[i]=rand.nextDouble(100);
            arr2[i]=Math.random();
        }
        System.out.println("Method random(): "+Arrays.toString(arr1));
        System.out.println("Class Math.random: "+Arrays.toString(arr2)+"\n");
        sort(arr1);
        sort(arr2);
    }
    public static void sort(double[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for(int j =0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    double t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
}