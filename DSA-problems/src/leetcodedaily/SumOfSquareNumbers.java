package leetcodedaily;

public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        long start = 0, end = (long) Math.sqrt(c);
        while (start <= end) {
            long val = start * start + end * end;
            if (val == c) {
                return true;
            } else if (val > c) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(new SumOfSquareNumbers().judgeSquareSum(5));
    }
}
