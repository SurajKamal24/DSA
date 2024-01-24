package arrays;

public class RowWithMax1s {
    static int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max = 0, index = -1;
            for (int i = 0; i < n; i++) {
                int count = 0;
            for (int j = 0; j < m ; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > max){
                max = count;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] arr = {
                        {0, 1, 1, 1},
                        {0, 0, 1, 1},
                        {1, 1, 1, 1},
                        {0, 0, 0, 0}
                      };
        System.out.println(rowWithMax1s(arr, 4, 4));
    }
}
