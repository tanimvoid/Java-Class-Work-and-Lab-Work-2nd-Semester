public class ArrayIndexExceptionDemo {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Program finished");
        }
    }
}