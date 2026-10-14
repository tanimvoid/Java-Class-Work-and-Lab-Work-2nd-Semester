import java.util.Scanner;

public class ReverseNumber {

    static int reverse(int n, int rev) {

        if (n == 0) {   // base condition
            return rev;
        }

        rev = rev * 10 + n % 10;

        return reverse(n / 10, rev);  // recursive call
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = reverse(num, 0);

        System.out.println("Reversed Number: " + result);
    }
}