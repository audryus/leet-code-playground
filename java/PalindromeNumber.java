/**
 * https://leetcode.com/problems/palindrome-number/
 * 
 * PalindromeNumber
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        StringBuilder sb =  new StringBuilder(""+x);
        String i = sb.toString();
        String j = sb.reverse().toString();
        if (i.equals(j)) {
            return true;
        }
        return false;
    }
}