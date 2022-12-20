package Practica3.P3N7;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Currency[] currencies = {new Currency("usd", 0.016, "$"), new Currency("eur", 0.018, "€"), new Currency("amd", 6.34, "֏")};
        double price = 0;
        System.out.println("Welcome to the Избушка на опушке!\n Our menu:");
        Item[] menu = {new Item("гренки с сыром", 59),new Item("мяной блинчик", 85),new Item("сырный Богатырь", 209), new Item("картошка по деревенски", 45), new Item("лимонад", 90)};
        for (Item item : menu) {
            System.out.format("    %s - %s₽\n",item.getName(), item.getPrice());
        }
        System.out.print("\nEnter your order: ");
        String order = input.nextLine();
        String[] orderArr = order.split(", ");
        for(String i:orderArr){
            for (Item j : menu) {
                if (i.equals(j.getName())) {
                    price += j.getPrice();
                }
            }
        }
        System.out.format("Price = %s₽\n", price);
        System.out.println("Do you want to change currency?");
        String answer = input.nextLine();
        if(answer.equals("yes")){
            System.out.print("Enter your currency: ");
            String currency = input.nextLine();
            for (Currency val : currencies) {
                if (val.getCurrencyCode().equals(currency)) {
                    price = price * val.getCurrencyCoefficient();
                    System.out.format("Price = %s%s", price, val.getSymbol());
                }
            }
        }
    }
}
