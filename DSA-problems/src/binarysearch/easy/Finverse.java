package binarysearch.easy;

public class Finverse {
    public static int f(int k) {
        int ans = 0;
        while(k > 0) {
            ans += k;
            k /= 10;
        }
        return ans;
    }
    public static int fInverse(int n) {
        int beg = 1, end = n;

        while(beg <= end) {
            int mid = (beg + end) / 2;
            int fMid = f(mid);
            if(fMid == n)
                return mid;
            else if(fMid > n)
                end = mid - 1;
            else
                beg = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(fInverse(1370));

    }
}
