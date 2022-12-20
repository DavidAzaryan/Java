package Practica4o1.N6;

public class Manager extends Employer{
    private String firstName;
    private String lastName;
    private double income;
    private int daysWorked;

    Manager(String firstName, String lastName, int daysWorked, double income) {
        super(firstName, lastName, daysWorked, income);
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
    public double getIncome() {
        return income;
    }
    @Override
    public double getIncome(int avDaysWorked) {
        if(getDaysWorked()>=avDaysWorked)
            return (getIncome()*12);
        return  getIncome();
    }
}
