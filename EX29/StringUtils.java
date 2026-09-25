class StringUtils {
    
    public static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
    
    public static String reverse(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }
    
    public static boolean isPalindrome(String text) {
        String lower = text.toLowerCase();
        String reversed = reverse(text).toLowerCase();
        return lower.equals(reversed);
    }
}
