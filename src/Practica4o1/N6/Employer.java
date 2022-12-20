package Practica4o1.N6;

public class Employer {
    private String firstName;
    private String lastName;
    private double income;
    private int daysWorked;
    Employer(String firstName, String lastName, int daysWorked, double income){
        this.firstName = firstName;
        this.lastName = lastName;
        this.daysWorked = daysWorked;
        this.income = income;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getDaysWorked() {
        return daysWorked;
    }
    public double getIncome(int avDaysWorked) {
        if(getDaysWorked()>=avDaysWorked)
            return getIncome()*12;
        return  getIncome();
    }

    public double getIncome() {
        return income;
    }
}
