package binarysearch.easy;
//https://leetcode.com/problems/sqrtx/
public class SqrtOfX {
    public int mySqrt(int x) {
        if (x == 1)
            return 1;
        int s = 0, e = x / 2;
        int ans = 0;
        while (s <= e) {
            long mid = s + (e - s) / 2;
            if (mid * mid <= x) {
                ans = (int) mid;
                s = (int) mid + 1;
            } else {
                e = (int) mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new SqrtOfX().mySqrt(4));
    }
}
