package arrays;

public class FindMinimumAndMaximumElementInAnArray {

    public static long[] getMinMax(long a[], long n) {
        //Write your code here
        long max = a[0];
        long min = a[0];
        for (long num : a) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return new long[]{min, max};
    }

    public static void main(String[] args) {
        long[] myList = {3, 2, 1, 56, 10000, 167};
        for (long num : getMinMax(myList, myList.length)) {
            System.out.print(num + " ");
        }
    }

}
