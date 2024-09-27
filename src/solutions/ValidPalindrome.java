package solutions;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String cleanedString = s.toLowerCase();
        cleanedString = cleanedString.trim();

        String reversedString = new StringBuilder(cleanedString).reverse().toString();

        if(cleanedString.isEmpty()) {
            return true;
        }

        return reversedString.equals(cleanedString);
    }
}
