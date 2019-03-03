/**
 * ZigZagConversion
 */
public class ZigZagConversion {

    public static void main(String[] args) {
        String pp = "PAYPALISHIRING";
        String abc = "abcdefghijklmnopqrstuvxy";
        System.out.println(convert(pp, 3)); //7
        System.out.println(convert(pp, 4)); //7
        System.out.println(convert(abc, 3)); //12
        System.out.println(convert(abc, 4)); //12
        System.out.println(convert(abc, 5)); //12
        System.out.println(convert(abc, 6)); //11
    }

    public static String convert(String s, int numRows) {
        String r = "";
        int j = numRows-2;
        int l = s.length();
        int tc = 0;

        for (int i = 0; i < l; i += numRows+j) {
            if (l - numRows > i) {
                tc += j;
            } 
            tc++;
        }

        System.out.print((l) + " ");
        System.out.print((l/numRows) + " ");
        System.out.print((l%numRows) + " ");
        System.out.print((j) + " ");
        System.out.println(tc);



        int[][] v = new int[numRows][tc];

        for (int n = 0; n < tc; n+=1+j) {
            for (int m = n+j; m < numRows; m++) {
                v[m][n] = s.charAt(m);
            }
        }



        return r;
    }
}