package Practica3.P3N7;

public class Currency {
    private String currencyCode;
    private double currencyCoefficient;
    private String simbol;
    Currency(String currencyCode, double currencyCoefficient, String simbol){
        this.currencyCode = currencyCode;
        this.currencyCoefficient = currencyCoefficient;
        this.simbol = simbol;
    }
    public double getCurrencyCoefficient() {
        return currencyCoefficient;
    }
    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getSymbol() {
        return simbol;
    }
}
