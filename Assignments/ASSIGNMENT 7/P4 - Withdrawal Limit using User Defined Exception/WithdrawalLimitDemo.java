import java.util.Scanner;

class WithdrawalException extends Exception {

    WithdrawalException(String msg) {
        super(msg);
    }
}

public class WithdrawalLimitDemo {

    static void withdraw(int amount) throws WithdrawalException {

        if(amount < 500)
            throw new WithdrawalException("Minimum withdrawal is 500");
        else if(amount > 10000)
            throw new WithdrawalException("Maximum withdrawal is 10000");
        else
            System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        try {
            withdraw(amount);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}