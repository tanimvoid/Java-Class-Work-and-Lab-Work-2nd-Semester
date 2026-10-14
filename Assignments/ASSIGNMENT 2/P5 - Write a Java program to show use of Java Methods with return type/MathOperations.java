public class MathOperations {
    // Method to calculate the square of a number
    public int square(int number) {
        return number * number;
    }

    // Method to calculate the cube of a number
    public int cube(int number) {
        return number * number * number;
    }

    // Method to calculate the factorial of a number
    public long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Method to find the maximum of two numbers
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        // Creating an object of the MathOperations class
        MathOperations mathOps = new MathOperations();

        // Calling methods and storing their return values
        int squareResult = mathOps.square(5);
        int cubeResult = mathOps.cube(3);
        long factorialResult = mathOps.factorial(4);
        int maxResult = mathOps.max(10, 20);

        // Displaying the results
        System.out.println("Square of 5: " + squareResult);
        System.out.println("Cube of 3: " + cubeResult);
        System.out.println("Factorial of 4: " + factorialResult);
        System.out.println("Maximum of 10 and 20: " + maxResult);
    }
}
