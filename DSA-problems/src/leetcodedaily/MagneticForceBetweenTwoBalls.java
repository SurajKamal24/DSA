package leetcodedaily;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {
    private int dist(int[] position, int mid) {
        int count = 1;
        int last = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - last >= mid) {
                count++;
                last = position[i];
            }
        }
        return count;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int st = 1;
        int en = position[position.length - 1] - position[0];
        while (st <= en) {
            int mid = (st + en) / 2;
            int count = dist(position, mid);
            if (count >= m) {
                st = mid + 1;
            } else {
                en = mid - 1;
            }
        }
        return en;
    }
    public static void main(String[] args) {
        System.out.println(new MagneticForceBetweenTwoBalls().maxDistance(new int[]{1, 2, 3, 4, 7}, 3));
    }
}
