package Practica4o1.N6;

public class Tester {
    public static void main(String[] args) {
        Employer[] employerArr = {
                new Employer("Vadim", "Varenyev", 5, 12000),
                new Manager("Steve", "Benson", 100, 130000),
                new Employer("Ivan", "Zavolokin", 150, 20000)
        };
        int avSum = 0;
        int avDays = 0;
        for (Employer emp : employerArr) {
            avDays += emp.getDaysWorked();
            avSum += emp.getIncome();
        }
        avDays = avDays/employerArr.length;
        avSum = avSum/employerArr.length;
        for (Employer e: employerArr) {
            if(e instanceof Manager){
                System.out.format("Income of %s %s: %s₽\n",  e.getFirstName(),e.getLastName(),e.getIncome(avDays)+avSum);
            }
            else
                System.out.format("Income of %s %s: %s₽\n",  e.getFirstName(),e.getLastName(),e.getIncome(avDays));;
        }
    }
}
