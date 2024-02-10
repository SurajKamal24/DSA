package strings.easy;

//https://leetcode.com/problems/make-the-string-great/description/

public class MakeTheStringGreat {

    public static String makeGood(String s) {
        /*boolean flag  = true;

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

        return s;*/
        StringBuilder sb = new StringBuilder(s);
        for (int j = 0; j < sb.length(); j++) {
            int count = 0;
            System.out.println("Inside for " + sb);
            for (int i = 0; i < sb.length() - 1; i++) {
                System.out.println("i " + sb.charAt(i) + " and i + 1 " + sb.charAt(i+1));
                if (Math.abs(sb.charAt(i) - sb.charAt(i+1)) == 32) {
                    sb.delete(i, i+2);
                    count++;
                    System.out.println("new lenght " + sb.length());
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "jeSsEJ";
        System.out.println(makeGood(s));
    }
}
