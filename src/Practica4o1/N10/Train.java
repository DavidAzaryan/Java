package Practica4o1.N10;

public class Train extends Transport{
    Train(double speed, double fuel, double fuelPrice, double cargoWeight) {
        super(speed, fuel, fuelPrice, cargoWeight);
    }
    @Override
    public double getCargoWeight() {
        return super.getCargoWeight();
    }
    @Override
    public double getFuel() {
        return super.getFuel();
    }
    @Override
    public double getPricePerKm() {
        return super.getPricePerKm();
    }
    @Override
    public double getSpeed() {
        return super.getSpeed();
    }
    @Override
    public String toString() {
        return "Train";
    }
}
