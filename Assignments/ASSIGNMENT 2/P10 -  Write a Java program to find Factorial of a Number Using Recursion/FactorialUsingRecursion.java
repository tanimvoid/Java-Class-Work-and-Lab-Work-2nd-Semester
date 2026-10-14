import java.util.Scanner;

public class FactorialUsingRecursion {
    // Method to find factorial using recursion
    public static long factorial(int n) {
        if (n <= 1) { // Base case: factorial of 0 or 1 is 1
            return 1;
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculating factorial
            long result = factorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }

        scanner.close();
    }
}
