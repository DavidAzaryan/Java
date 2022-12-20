package Practica3.P3N3;

import java.util.Arrays;
import java.util.Random;

public class P3N3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[4];
        boolean incr = true;
        for(int i =0; i < arr.length; i++){
            arr[i] = rand.nextInt(10, 99);
        }
        System.out.println("Random generated array: " + Arrays.toString(arr));
        for(int j =0; j < arr.length -1; j++){
            if(arr[j]>=arr[j+1]){
                incr = false;
                break;
            }
        }
        if(incr){
            System.out.println("Array is strictly increasing.");
        }
        else
            System.out.println("Array is not strictly increasing.");
    }
}
