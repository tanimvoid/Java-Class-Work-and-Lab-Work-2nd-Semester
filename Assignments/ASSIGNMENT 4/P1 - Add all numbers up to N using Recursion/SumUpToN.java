import java.util.Scanner;

public class SumUpToN {

    // Recursive function
    static int sum(int n) {
        if (n == 0) {     // base condition
            return 0;
        }
        return n + sum(n - 1);   // recursive call
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = sum(n);

        System.out.println("Sum of numbers from 1 to " + n + " = " + result);
    }
}