package Email_generator;

public class EmailMainProgram {
    public static void main(String[] args) {
        EmailBackProgram email = new EmailBackProgram("Saurav", "Chafle");
        System.out.println(email.showInfo());

    }
}
