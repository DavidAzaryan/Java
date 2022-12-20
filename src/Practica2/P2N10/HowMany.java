package Practica2.P2N10;
import java.util.ArrayList;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence separated by spaces: ");
        String sentence = input.nextLine();
        String[] wordsArr = sentence.split(" ");
        ArrayList<String> filtered = new ArrayList<>();
        boolean isWord = true;
        for (String word : wordsArr) {
            for (int j = 0; j < word.length(); j++) {
                if (!Character.isLetter(word.charAt(j))) {
                    isWord = false;
                    break;
                }
            }
            if (isWord)
                filtered.add(word);
            isWord = true;
        }
        System.out.format("You entered %s words: %s",filtered.size(), filtered);
    }
}