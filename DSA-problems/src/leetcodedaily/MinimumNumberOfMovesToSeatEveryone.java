package leetcodedaily;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int res = 0;
        for (int i = 0; i < seats.length; i++) {
            res += Math.abs(seats[i] - students[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumNumberOfMovesToSeatEveryone().minMovesToSeat(new int[]{3,1,5}, new int[]{2,7,4}));
    }
}
