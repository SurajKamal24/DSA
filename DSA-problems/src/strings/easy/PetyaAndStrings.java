package strings.easy;

//https://codeforces.com/problemset/problem/112/A
public class PetyaAndStrings {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = "AbCdEfF";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
       for (int i = 0; i < str1.length(); i++) {
           if(str1.charAt(i) < str2.charAt(i)) {
               System.out.println(-1);
               return;
           }
           if (str1.charAt(i) > str2.charAt(i)) {
               System.out.println(1);
               return;
           }
       }
        System.out.println(0);
    }
}
