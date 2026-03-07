public class UseCase13PalindromeCheckerApp {
    public static boolean reverseMethod(String text) {

        String reversed = "";

        for(int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        return text.equals(reversed);
    }

    public static boolean twoPointerMethod(String text) {

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

    public static void main(String[] args) {

        String text = "madam";

        long start1 = System.nanoTime();

        boolean result1 = reverseMethod(text);

        long end1 = System.nanoTime();

        long start2 = System.nanoTime();

        boolean result2 = twoPointerMethod(text);

        long end2 = System.nanoTime();

        System.out.println("Reverse Method Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Two Pointer Method Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");
    }
}