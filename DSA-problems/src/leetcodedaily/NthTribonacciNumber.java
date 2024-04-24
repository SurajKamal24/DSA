package leetcodedaily;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        int[] F = new int[38];
        F[0] = 0;
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i <= n; i++) {
            F[i] = F[i - 3] + F[i - 2] + F[i - 1];
        }
        return F[n];
    }

    public static void main(String[] args) {
        System.out.println(new NthTribonacciNumber().tribonacci(25));
    }
}
