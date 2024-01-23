package arrays;

public class FindSmallestAndSecondSmallest {

    public static long[] minAnd2ndMin(long a[], long n)
    {
        long min1 = Integer.MAX_VALUE;
        long min2 = Integer.MAX_VALUE;
        for (long num : a) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            }
            else if (num != min1 && num < min2) {
                min2 = num;
            }
        }
        if (min1 == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE)
            return new long[] {-1, -1};
        else
            return new long[] {min1, min2};
    }

    public static void main(String[] args) {
        long[] arr = {1, 1, 1, 1, 1};
        for (long num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n" +arr.length);
        minAnd2ndMin(arr, arr.length);
        long[] res = minAnd2ndMin(arr, arr.length);
        System.out.println(res[0] + " " + res[1]);

    }

}
