package arrays;

//https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
public class CyclicallyRotateAnArrayByOne {

    static public void rotate(int arr[], int n)
    {
        int last = arr[n-1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        rotate(arr, n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
