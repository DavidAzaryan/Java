package Practica4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] Cars = {"Reno", "BMW"};
        String[] Bikes = {"MTT", "Dodge"};
        String[] ATVs = {"BRP", "Kymco", "Hensim"};
        Catalogs[] catalogs = {new Catalogs("Cars", Cars), new Catalogs("Bikes", Bikes), new Catalogs("ATVs", ATVs)};
        ArrayList<String> basket = new ArrayList<>();
        String command = "";
        int level = 0;
        boolean isInArr = false;
        signIn("David", "123");
        while (!command.equals("exit")) {
            if (level == 0) {
                System.out.println("exit or continue?");
                System.out.println("//exit- exit the program\n//next- show all catalogs");
                command = input.nextLine();
                if (command.equals("next")) {
                    level += 1;
                }
            }
            if (level == 1) {
                System.out.println("All catalogs: ");
                for (Catalogs c : catalogs)
                    System.out.print("    " + c.getCatalogName() + "\n");
                System.out.println("//back-return to the previous page\n//enter the name of the catalog you want to open");
                command = input.nextLine();
                if (command.equals("back"))
                    level -= 1;
                else if (!command.equals("exit"))
                    level += 1;
            }
            if (level == 2) {
                Find(command, catalogs);
                System.out.println("//back-return to the previous page\n//buy-buy chosen item");
                command = input.nextLine();
                if (command.equals("back"))
                    level -= 1;

                if (command.equals("buy")) {
                    System.out.print("enter the name of the item you want to buy: ");
                    String name = input.nextLine();
                    for (Catalogs cat : catalogs) {
                        isInArr = false;
                        if (findArr(name, cat.getProductsArr())) {
                            basket.add(name);
                            System.out.println(name + "is added to you basket!");
                            isInArr = true;
                            break;
                        }
                    }
                    if(!isInArr){
                        System.out.println("item is not found.");
                    }
                }
            }
        }
        System.out.print("Your basket: " + basket + "\nEvery thing is free! Have a nice day!");
    }

    public static boolean Find(String searchFor, Catalogs[] searchIn) {
        for (Catalogs x : searchIn) {
            if (x.getCatalogName().equals(searchFor)) {
                System.out.println(Arrays.toString(x.getProductsArr()));
                return true;
            }
        }
        return false;
    }
    public static boolean findArr(String searchFor, String[] searchIn) {
        for (String x : searchIn) {
            if (x.equals(searchFor)) {
                return true;
            }
        }
        return false;
    }
    public static void signIn(String name, String password) {
        String nameIn = "";
        String passwordIn = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please sign in");
        System.out.print("login: ");
        while (!nameIn.equals(name)) {
            nameIn = input.nextLine();
            if (!nameIn.equals(name)) {
                System.out.println("Unknown user.");
                System.out.print("login: ");
            }
        }
        System.out.print("password: ");
        while (!passwordIn.equals(password)) {
            passwordIn = input.nextLine();
            if (!passwordIn.equals(password)) {
                System.out.println("Incorrect password.");
                System.out.print("password: ");
            }
        }
        System.out.println("Welcome to the \"Everything is free\" " + name + "!");
    }
}