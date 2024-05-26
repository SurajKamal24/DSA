package contest.weeklycontest399;

public class FindTheNumberOfGoodPairsI {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int pairCount = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) {
                    pairCount++;
                }
            }
        }
        return pairCount;
    }
    public static void main(String[] args) {
        System.out.println(new FindTheNumberOfGoodPairsI().numberOfPairs(new int[] {1,2,3}, new int[] {3}, 3));
    }
}
