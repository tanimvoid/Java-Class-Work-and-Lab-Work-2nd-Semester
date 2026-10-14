public class DivideByZeroDemo {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}