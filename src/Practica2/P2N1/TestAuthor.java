package Practica2.P2N1;

public class TestAuthor {
    public static void main(String[] args) {
        Author k1 = new Author("robert83@mail.ru", "Robert", 'm');
        System.out.print("Name: " + k1.getName());
        System.out.print("\nMail: " + k1.getMail());
        System.out.print("\nGender: " + k1.getGender());
    }
}
