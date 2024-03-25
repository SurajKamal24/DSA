package binarysearch.medium;
//https://leetcode.com/problems/search-a-2d-matrix/
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int l = 0, r = m * n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int x  = mid / m;
            int y = mid % m;
            System.out.println(matrix[x][y]);
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /*int[][] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,50}
        };
        int target = 3;*/
        int[][] matrix = {{1,1}};
        int target = 2;
        System.out.println((new SearchA2DMatrix()).searchMatrix(matrix, target));
    }
}
