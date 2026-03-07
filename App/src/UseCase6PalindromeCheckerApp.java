import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;
        for(int i = 0; i < text.length(); i++) {

            char queueChar = queue.remove();
            char stackChar = stack.pop();

            if(queueChar != stackChar) {
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