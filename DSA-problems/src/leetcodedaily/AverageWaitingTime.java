package leetcodedaily;

public class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        double result = 0;
        int extra = customers[0][0];
        for (int[] arr : customers) {
            extra = extra >= arr[0] ? extra + arr[1] : arr[0] + arr[1];
            result = result + extra - arr[0];
        }
        return result / customers.length;
    }

    public static void main(String[] args) {
        System.out.println(new AverageWaitingTime().averageWaitingTime(new int[][]{{5, 2}, {5, 4}, {10, 3}, {20, 1}}));
    }
}
