
class PalindromeChecker {

    public boolean checkPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while(start < end) {

            if(text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(text);

        if(result) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }
    }
}