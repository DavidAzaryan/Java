package Practica4o1.N2;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phone[] phonesArr = { new Phone(111, "one", 1.1), new Phone(222, "two", 1.2), new Phone(333, "three", 1.3)};
        int count = 0;
        int number = -1;
        ArrayList<String> sendTo = new ArrayList<String>();
        for (Phone p : phonesArr){
            System.out.format("Phone №%d:\n    number - %d\n    model - %s\n    weight - %f\n", count+1,p.getNumber(), p.getModel(), p.getWeight());
        }
        System.out.println("\nMethod with 1 variables:");
        for (Phone p2 : phonesArr){
            System.out.println(p2.receiveCall("David"));
            System.out.println("number: "+p2.getNumber());
        }
        System.out.println("\nMethod with 2 variables:");
        for (Phone p2 : phonesArr){
            System.out.println(p2.receiveCall("David", p2.getNumber()));
            System.out.println("number: "+p2.getNumber());
        }
        System.out.println("Enter the numbers of people you want send message to:");
        while (number != 0) {
            number = input.nextInt();
            sendMessage(number);
            for(Phone p3 : phonesArr){
                if(p3.getNumber()==(number)){
                    sendTo.add(String.valueOf(number));
                }
            }
        }
        if(!sendTo.isEmpty())
            System.out.println("Message was send to: "+sendTo);
        else
            System.out.println("Message was send to nobody.");
    }
    public static void sendMessage(int number, int...arg){
        for (int num : arg){
            System.out.println(number);
        }
    }
}
