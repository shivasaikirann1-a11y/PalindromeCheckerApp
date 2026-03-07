import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

interface PalindromeStrategy {
    boolean checkPalindrome(String text);
}

class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String text) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String text) {

        Deque<Character> deque = new ArrayDeque<>();

        for(int i = 0; i < text.length(); i++) {
            deque.addLast(text.charAt(i));
        }

        while(deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if(first != last) {
                return false;
            }
        }

        return true;
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        PalindromeStrategy strategy;

        strategy = new StackStrategy();

        boolean result = strategy.checkPalindrome(text);

        if(result) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }
    }
}