package contest.leetcode130424;

public class ScoreOfAString {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            sum += Math.abs(s.charAt(i) - s.charAt(i-1));
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(new ScoreOfAString().scoreOfString("zaz"));
    }
}
