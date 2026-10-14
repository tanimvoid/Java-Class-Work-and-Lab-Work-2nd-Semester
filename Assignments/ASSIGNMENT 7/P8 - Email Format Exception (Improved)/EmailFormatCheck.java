import java.util.Scanner;

class EmailFormatException extends Exception {

    EmailFormatException(String msg) {
        super(msg);
    }
}

public class EmailFormatCheck {

    static void checkEmail(String email) throws EmailFormatException {

        if(email.indexOf("@") < 2 || email.indexOf(".") < email.indexOf("@"))
            throw new EmailFormatException("Email format incorrect");
        else
            System.out.println("Email format correct");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        try {
            checkEmail(email);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}