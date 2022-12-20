package Practica4o1.N10;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        boolean isIn = false;
        int index = 0;
        Transport[] transports = {
                new Car(60, 9.3,49.90, 3.5),
                new Airplane(100, 230, 37.50, 80),
                new Train(80, 160, 42.67, 150),
                new Ship(37.04, 239, 42.67, 10000)
        };
        while (!isIn) {
            System.out.print("Ведите название транспорта: ");
            name = input.nextLine();
            for (int i = 0; i < transports.length; i++){
                if(transports[i].toString().equals(name)){
                    isIn = true;
                    index = i;
                    break;
                }
            }
            if (!isIn){
                System.out.println("Транспорт не найден.");
            }
        }
        System.out.print("Введите длину маршрута: ");
        double length = Double.valueOf(input.nextLine());

        System.out.println("Стоимость перевозки: " + transports[index].getPricePerKm()*length + " рублей");
        System.out.print("Время перевозки: " + length/transports[index].getSpeed() + " часов");
    }
}
