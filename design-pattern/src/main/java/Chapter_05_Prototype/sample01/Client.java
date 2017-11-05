package Chapter_05_Prototype.sample01;

public class Client {
    public static void main(String a[]) {

        Email email = new Email();
        Email copyEmail = (Email) email.clone();

        System.out.println("email==copyEmail?");
        System.out.println(email == copyEmail);

        System.out.println("email.getAttachment==copyEmail.getAttachment?");
        System.out.println(email.getAttachment() == copyEmail.getAttachment());
    }
}