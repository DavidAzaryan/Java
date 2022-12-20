package Practica2.P2N1;

public class Author {
    public String mail;
    public String name;
    public char gender;
    public Author(String mail, String name, char gender){
        this.mail = mail;
        this.name = name;
        this.gender = gender;
    }
    public String getMail(){ return mail;}
    public  void setMail(){this.mail = mail;}
    public String getName(){ return name;}
    public  void setName(){this.name = name;}
    public char getGender(){ return gender;}
    public  void setGender(){this.gender = gender;}
    public String ToString(){
        return ("Name: " + name + "\n Mail: " + mail + "\n Gender: " + gender);
    }
}
