import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for(int i = 0; i < text.length(); i++) {

            char poppedChar = stack.pop();

            if(text.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }

    }
}