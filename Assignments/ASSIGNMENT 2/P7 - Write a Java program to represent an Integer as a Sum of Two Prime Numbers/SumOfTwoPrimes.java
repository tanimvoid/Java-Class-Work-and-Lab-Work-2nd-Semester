import java.util.Scanner;

public class SumOfTwoPrimes {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find and display pairs of primes that sum up to the given number
    public static void findPrimePairs(int number) {
        boolean foundPair = false;
        for (int i = 2; i <= number / 2; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                System.out.println(number + " = " + i + " + " + (number - i));
                foundPair = true;
            }
        }
        if (!foundPair) {
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Finding and displaying pairs of primes
        findPrimePairs(number);

        scanner.close();
    }
}
