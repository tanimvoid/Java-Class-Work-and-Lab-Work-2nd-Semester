import java.util.Scanner;

public class BinaryToDecimal {
    // Method to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1; // 2^0

        // Start from the end of the binary string
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2; // Increase the power of 2
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking binary input from the user
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        // Validating the input
        if (!binary.matches("[01]+")) {
            System.out.println("Invalid binary number.");
        } else {
            // Converting binary to decimal
            int decimal = binaryToDecimal(binary);
            System.out.println("The decimal equivalent of binary " + binary + " is: " + decimal);
        }

        scanner.close();
    }
}
