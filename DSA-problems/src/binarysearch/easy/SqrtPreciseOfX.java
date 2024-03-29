package binarysearch.easy;

import static java.lang.Math.pow;

public class SqrtPreciseOfX {
    public double mySqrt(int x) {
        if (x == 1)
            return 1;
        double s = 0, e = x / 2;
        double ans = 0;
        double precision = pow(10, -1);
        while (e - s >= precision) { // stop based on zooming in
            double mid = s + (e - s) / 2;
            if (mid * mid == x)
                return mid;
            else if (mid * mid < x) {
                s = mid;
            } else {
                e = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new SqrtPreciseOfX().mySqrt(4));
    }
}
