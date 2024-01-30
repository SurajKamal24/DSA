package strings.easy;

//https://leetcode.com/problems/make-the-string-great/description/

public class MakeTheStringGreat {

    public static String makeGood(String s) {
        boolean flag  = true;

        while (flag) {
            flag = false;
            StringBuilder sb =  new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if ((i+1) < s.length() && Math.abs(s.charAt(i) - s.charAt(i+1)) == 32) {
                    flag = true;
                    i++;
                } else {
                    sb.append(s.charAt(i));
                }
            }
            s = sb.toString();
        }

        return s;
    }
    public static void main(String[] args) {
        String s = "abBAcC";
        System.out.println(makeGood(s));
    }
}
