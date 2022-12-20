package Practica2.P2N4;
import java.util.Scanner;

public class ShopTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shop shop= new Shop();
        String command = "";
        String computerName;

        System.out.println("Commands:\n add\n delete\n search\n list");
        System.out.println("for exiting the program type 'exit'");
        while (!command.equals("exit")){
            System.out.print("Enter the command: ");
            command = input.nextLine();
            switch (command) {
                case("add"):
                    System.out.print("Enter the list of the computers you want to add: ");
                    computerName = input.nextLine();
                    shop.addComputer(computerName);
                    break;

                case("delete"):
                    System.out.print("Enter the name of the computer you want to delete: ");
                    computerName = input.nextLine();
                    shop.deleteComputer(computerName);
                    break;

                case("search") :
                    System.out.print("Enter the name of the computer you want to search for: ");
                    computerName = input.nextLine();
                    shop.searchComputer(computerName);
                    break;

                case("list"):
                    shop.printList();
                    break;

                default:
                    if (!command.equals("exit"))
                        System.out.println("Unknown command.");
                    break;
            }
        }
    }
}
