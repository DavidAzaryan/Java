package Practica2.P2N8;

public class Array {
    public static void main(String[] args) {
        String[] words = new String[] {"1", "2", "3", "4", "5"};
        for (String s : words) {
            System.out.print(s);
        }
        System.out.println();
        int n = words.length;
        String temp;
        for (int i = 0; i < n/2; i++) {
            temp = words[n-i-1];
            words[n-i-1] = words[i];
            words[i] = temp;
        }
        for (String word : words) {
            System.out.print(word);
        }
    }
}
