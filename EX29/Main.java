import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        int vowelCount = StringUtils.countVowels(text);
        String reversed = StringUtils.reverse(text);
        boolean palindrome = StringUtils.isPalindrome(text);
        
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Reversed: " + reversed);
        System.out.println("Palindrome: " + palindrome);
    }
}
