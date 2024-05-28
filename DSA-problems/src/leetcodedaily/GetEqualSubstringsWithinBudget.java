package leetcodedaily;

public class GetEqualSubstringsWithinBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0, n = s.length();
        int currentCost = 0, maxLenght = 0;
        for (int end = 0; end < n; end++) {
            currentCost += Math.abs(s.charAt(end) - t.charAt(end));
            while (currentCost > maxCost) {
                currentCost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            maxLenght = Math.max(maxLenght, end - start + 1);
        }
        return maxLenght;
    }
    public static void main(String[] args) {
        System.out.println(new GetEqualSubstringsWithinBudget().equalSubstring("abcd", "bcdf", 3));
    }
}
