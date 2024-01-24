package arrays;

public class CountSortedRows {
    static int sortedCount(int N, int M, int Mat[][]) {
        // code here
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (isIncreasing(Mat[i], M) || isDecreasing(Mat[i], M)) {
                ans++;
            }
        }
        return ans;
    }
    static boolean isIncreasing(int[] Mat, int M) {
        for (int i = 1; i < M; i++) {
            if (Mat[i] <= Mat[i-1])
                return false;
        }
        return true;
    }

    static boolean isDecreasing(int[] Mat, int M) {
        for (int i = 1; i < M; i++) {
            if (Mat[i] >= Mat[i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] Mat = {
                {1,2,3},
                {6,5,4},
                {7,9,8}
        };
        System.out.println(sortedCount(3,3,Mat));
    }

}
