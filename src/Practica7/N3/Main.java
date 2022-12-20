package Practica7.N3;

public class Main
{
    public static void main(String args[])
    {
        IStringWorker stringWorker = new StringWorker();

        String testString = "I love Armenia";

        System.out.println(String.format("нечётные симолы: %s",stringWorker.getNewStringFromString(testString)));
        System.out.println(String.format("Инвертированный: %s",stringWorker.invertString(testString)));
        System.out.println(String.format("Кол-во символов: %s",stringWorker.countSymbols(testString)));
    }
}