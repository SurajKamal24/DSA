package strings.medium;

//https://leetcode.com/problems/zigzag-conversion/description/

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return  s;

        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < numRows; r++) {
            int increment = (numRows - 1) * 2;
            int i = r;
            while (i < s.length()) {
                sb.append(s.charAt(i));
                if (r > 0 && r < numRows - 1 && (i + increment - 2 * r) < s.length())
                    sb.append(s.charAt(i + increment - 2 * r));
                i += increment;
            }
        }

        String ans = sb.toString();
        return ans;
    }
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println(convert(s, numRows));
    }
}
