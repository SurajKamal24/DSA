package contest.biweeklycontest134;

public class AlternatingGroupsII {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int count = 0;
        int n = colors.length;
        int c = 1;
        for (int i = 0; i < n + k - 1; i++) {
            if (colors[i % n] != colors[(i + 1) % n]) {
                c++;
            } else {
                c = 1;
            }
            if (c >= k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new AlternatingGroupsII().numberOfAlternatingGroups(new int[]{0,1,0,1,0}, 3));
    }
}
