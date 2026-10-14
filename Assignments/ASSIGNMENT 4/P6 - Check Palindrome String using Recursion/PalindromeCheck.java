import java.util.Scanner;

public class PalindromeCheck {

    static boolean isPalindrome(String str) {

        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {

            return isPalindrome(str.substring(1, str.length() - 1));
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        if (isPalindrome(text)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }
    }
}