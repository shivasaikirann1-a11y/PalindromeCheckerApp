public class UseCase9PalindromeCheckerApp {

    public static boolean isPalindrome(String text, int start, int end) {

        if(start >= end) {
            return true;
        }
        if(text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindrome(text, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String text = "madam";

        boolean result = isPalindrome(text, 0, text.length() - 1);

        if(result) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }
    }
}