package Practica2.P2N9;
import java.util.*;

public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ranksArr = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A",};
        String[] suitsArr = {"\u2664", "\u2667", "\u2666", "\u2665"};
        ArrayList<String> deck = new ArrayList<>();
        List<Integer> points = new ArrayList<>();
        String hand = "";
        int total = 0;

        for (String rank : ranksArr) {
            for (String suit : suitsArr) {
                deck.add(rank + suit);
            }
        }
        Collections.shuffle(deck);
        System.out.print("Enter the number of players: ");
        int number = sc.nextInt();
        if(number <= 9){
            for(int i = 0; i < number; i++) {
                System.out.format("Player № %s: ", i + 1);
                for (int j = 0; j != 5; j++) {
                    hand += " " + deck.get(j);
                    System.out.print(deck.get(j) + " ");
                    deck.remove(deck.get(j));
                    hand = hand.substring(1, hand.length()-1);
                    for (int r = 0; r < ranksArr.length; r++) {
                        if (hand.equals(ranksArr[r])) {
                            total += r+2;
                            hand = "";
                            break;
                        }
                    }
                }
                points.add(total);
                System.out.println("points: " + total);
                total = 0;
            }
            int max = Collections.max(points);
            System.out.format("\nPlayer № %s wins!\n", points.indexOf(max) + 1);
        }
        else
            System.out.println("Limit of 9 players");
    }
}
