/**
 * https://leetcode.com/problems/string-to-integer-atoi/
 * https://leetcode.com/problems/palindrome-number/
 * String2IntegerAtoi
 */
public class String2IntegerAtoi {

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("     -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("3.14159"));
        System.out.println(myAtoi(".14159"));
        System.out.println(myAtoi("+-2"));
    }

    public static int myAtoi(String str) {
        str = str.trim();
        String[] arr = str.split(" ");

        String n = arr[0];
        if (!n.matches(".*\\d+.*")) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        boolean negative = false;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (i == 0) {
                if (c == '+') {
                    continue;
                } else if (c == '-') {
                    negative = true;
                    continue;
                }
            }
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                break;
            }
        }

        Integer i = 0;
        // System.out.println(sb);
        
        try {
            String s = sb.toString();
            if (s.isEmpty()) {
                s = "0";
            }
            i = Integer.parseInt(s);
        } catch (Exception e) {
            i = Integer.MAX_VALUE;
            if (negative) {
                i = Integer.MIN_VALUE;
            }
        }

        if (negative) {
            i = 0-i;
        }

        return i;
    }
}