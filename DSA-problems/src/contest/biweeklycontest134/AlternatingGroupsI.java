package contest.biweeklycontest134;

public class AlternatingGroupsI {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        int n = colors.length;
        for (int i = 0; i < n; i++) {
            if (colors[i] == colors[(i + 2) % n] && colors[i] != colors[(i + 1) % n]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new AlternatingGroupsI().numberOfAlternatingGroups(new int[]{0,1,0,0,1}));
    }
}
