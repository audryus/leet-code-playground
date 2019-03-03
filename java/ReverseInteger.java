import java.math.BigInteger;

/**
 * https://leetcode.com/problems/reverse-integer/
 * 
 * ReverseInteger
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(100));
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }
        boolean sig = false;
        if (x < 0) {
            sig = true;
            x = Math.abs(x);
        }
        StringBuilder sv = new StringBuilder(""+x).reverse();
        try {
            x = Integer.parseInt(sv.toString());
        } catch (Exception e) {
            return 0;
        }
        if (sig) {
            x = 0 - x;
        }
        return x;
    }
}