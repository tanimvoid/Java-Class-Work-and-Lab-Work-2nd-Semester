import java.util.Scanner;

public class DecimalToBinary {
    // Method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking decimal input from the user
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Converting decimal to binary
        String binary = decimalToBinary(decimal);
        System.out.println("The binary equivalent of decimal " + decimal + " is: " + binary);

        scanner.close();
    }
}
