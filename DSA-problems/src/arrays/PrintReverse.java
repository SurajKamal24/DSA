package arrays;

public class PrintReverse {

    public static int[] reverse(int[] arr, int n) {
        int i = 0, temp;
        while (i < n/2) {
            temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n" + arr.length);
        for (int num : reverse(arr, arr.length - 1)) {
            System.out.print(num + " ");
        }

    }

}
