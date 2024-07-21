package contest.weeklycontest407;

public class NumberOfBitChangesToMakeTwoIntegersEqual {
    public int minChanges(int n, int k) {
        public int minChanges(int n, int k) {
            String binaryN = Integer.toBinaryString(n);
            String binaryK = Integer.toBinaryString(k);
            int maxLen = Math.max(binaryN.length(), binaryK.length());
            binaryN = String.format("%" + maxLen + "s", binaryN).replace(" ", "0");
            binaryK = String.format("%" + maxLen + "s", binaryK).replace(" ", "0");
            int onesInN = 0, minChanges = 0;
            for (int i = 0; i < maxLen; i++) {
                if (binaryN.charAt(i) == '1') {
                    onesInN++;
                    if (binaryK.charAt(i) == '0') {
                        minChanges++;
                    }
                }
                if (binaryN.charAt(i) == '0' and binaryK.charAt(i) == '1') {
                    return -1;
                }
            }
            if (onesInN > minChanges) {
                return -1;
            }
            return minChanges;
        }
    }
    public static void main(String[] args) {
        System.out.println(new NumberOfBitChangesToMakeTwoIntegersEqual().minChanges(14, 13));
    }
}
