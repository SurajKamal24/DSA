package contest.leetcode120524;

public class TakingMaximumEnergyFromTheMysticDungeon {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= n - k; i--) {
            int sum = 0;
            for (int j = 0; j >= 0; j -= k) {
                sum += energy[i];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(new TakingMaximumEnergyFromTheMysticDungeon().maximumEnergy(new int[] {5,2,-10,-5,1}, 3));
    }
}
