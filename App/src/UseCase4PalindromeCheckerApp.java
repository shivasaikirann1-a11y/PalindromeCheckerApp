public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        char[] characters = text.toCharArray();

        boolean isPalindrome = true;

        int start = 0;
        int end = characters.length - 1;

        while(start < end) {

            if(characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if(isPalindrome) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }

    }
}