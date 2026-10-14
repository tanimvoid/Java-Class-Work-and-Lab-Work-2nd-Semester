import java.util.Scanner;

public class ReverseSentence {

    static void reverse(String str) {

        if (str.length() == 0) {   // base condition
            return;
        }

        System.out.print(str.charAt(str.length() - 1));

        reverse(str.substring(0, str.length() - 1));  // recursive call
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        System.out.print("Reversed Sentence: ");
        reverse(text);
    }
}