package Practica4o1.N10;

public abstract class Transport {
    private double pathLength;
    private double cargoWeight;
    private double pricePerKm;
    private double fuelPrice;
    private double speed;
    private double fuel;
    Transport (double speed,double fuel, double fuelPrice, double cargoWeight){
        this.cargoWeight = cargoWeight;
        this.fuel = fuel;
        this.fuelPrice = fuelPrice;
        this.speed = speed;
        pricePerKm =(fuel*fuelPrice)/100;
    }
    public double getCargoWeight() {
        return cargoWeight;
    }
    public double getFuel() {
        return fuel;
    }
    public double getFuelPrice() {
        return fuelPrice;
    }
    public double getPathLength() {
        return pathLength;
    }
    public double getPricePerKm() {
        return pricePerKm;
    }
    public double getSpeed() {
        return speed;
    }
    @Override
    public abstract String toString() ;
}
