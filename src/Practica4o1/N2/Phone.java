package Practica4o1.N2;

public class Phone {
    private  int number;
    private String model;
    private double weight;
    private String callerName;
    Phone(int number, String model, double weight){
        this(number,model);
        this.weight = weight;
    }
    Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(){

    }
    public String receiveCall(String callerName){
        return (callerName + " is calling you.");
    }
    public String receiveCall(String callerName, int number){
        return (callerName + " is calling you.");
    }
    public double getWeight() {
        return weight;
    }
    public int getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
}
