import java.util.Scanner;

class InvalidEmailException extends Exception {

    InvalidEmailException(String msg) {
        super(msg);
    }
}

public class EmailValidation {

    static void validateEmail(String email) throws InvalidEmailException {

        if(!email.contains("@") || !email.contains("."))
            throw new InvalidEmailException("Invalid Email Format");
        else
            System.out.println("Email is valid");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        try {
            validateEmail(email);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}