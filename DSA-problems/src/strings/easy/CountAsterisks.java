package strings.easy;

//https://leetcode.com/problems/count-asterisks/description/

public class CountAsterisks {
    public static int countAsterisks(String s) {
        int count = 0;
        boolean flag = false;
        for (char ch : s.toCharArray()) {
            if (ch == '*' && !flag) {
                count++;
            } else if (ch == '|') {
                flag = ! flag;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s  = "l|*e*et|c**o|*de|";
        System.out.println(countAsterisks(s));
    }
}
