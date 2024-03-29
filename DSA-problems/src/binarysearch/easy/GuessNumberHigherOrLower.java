package binarysearch.easy;

public class GuessNumberHigherOrLower {
    int guess(int num) {
        if (num == 6) {
            return 0;
        } else if (num < 6) {
            return 1;
        } else {
            return -1;
        }
    }
    public int guessNumber(int n) {
        int l = 0, r = n;
        int mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            int result = guess(mid);
            if (result == 0) {
                return mid;
            } else if (result == -1) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        System.out.println(new GuessNumberHigherOrLower().guessNumber(10));
    }
}
