package leetcodedaily;

public class MaximumScoreFromRemovingSubstrings {
    private int getMaxScore(String s, char first, char second, int firstPoints, int secondPoints) {
        int score = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == second && sb.length() > 0 && sb.charAt(sb.length() - 1) == first) {
                sb.deleteCharAt(sb.length() - 1);
                score += firstPoints;
            } else {
                sb.append(c);
            }
        }
        s = sb.toString();
        sb.setLength(0);
        for (char c : s.toCharArray()) {
            if (c == first && sb.length() > 0 && sb.charAt(sb.length() - 1) == second) {
                sb.deleteCharAt(sb.length() - 1);
                score += secondPoints;
            } else {
                sb.append(c);
            }
        }
        return score;
    }
    public int maximumGain(String s, int x, int y) {
        if (x >= y) {
            return getMaxScore(s, 'a', 'b', x, y);
        } else {
            return getMaxScore(s, 'b', 'a', y, x);
        }
    }
    public static void main(String[] args) {
        System.out.println(new MaximumScoreFromRemovingSubstrings().maximumGain("cdbcbbaaabab", 4, 5));
    }
}
