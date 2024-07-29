package leetcodedaily;

public class CountNumberOfTeams {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((rating[i] < rating[j] && rating[j] < rating[k]) ||
                            (rating[i] > rating[j] && rating[j] > rating[k])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new CountNumberOfTeams().numTeams(new int[] {2,5,3,4,1}));
    }
}
