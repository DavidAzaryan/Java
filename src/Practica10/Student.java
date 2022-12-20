package Practica10;

public class Student {
    private String Name;
    private String Surname;
    private String Special;
    private int Course;
    private String Group;
    private int GPA;

    public Student(String name, String surname, String special, int course, String group, int GPA) {
        Name = name;
        Surname = surname;
        Special = special;
        Course = course;
        Group = group;
        this.GPA = GPA;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getSpecial() {
        return Special;
    }

    public void setSpecial(String special) {
        Special = special;
    }

    public int getCourse() {
        return Course;
    }

    public void setCourse(int course) {
        Course = course;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
}
