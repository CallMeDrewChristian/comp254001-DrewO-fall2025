//Drew Oro 301337741 F25 COMP254-001
import java.util.Scanner;
public class Exercise2 {

    public static boolean checkPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return checkPalindrome(s.substring(1, s.length() - 1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scanner.nextLine();
        word = word.toLowerCase();
        if (checkPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        }
        else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
