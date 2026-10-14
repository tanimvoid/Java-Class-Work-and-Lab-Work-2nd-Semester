import java.util.Scanner;

class OddNumberException extends Exception {

    OddNumberException(String msg) {
        super(msg);
    }
}

public class OddNumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            if(num % 2 != 0)
                throw new OddNumberException("Number is odd");
            else
                System.out.println("Number is even");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}