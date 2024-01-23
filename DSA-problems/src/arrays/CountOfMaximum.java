package arrays;

import java.util.Scanner;

public class CountOfMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test_cases = scanner.nextInt();
        int[] count = new int[10001];
        while (test_cases-- > 0) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                count[a]++;
            }
            int max_count = 0;
            int max_value = 0;
            for (int i = 10000; i >= 1; i--) {
                if (count[i] >= max_count) {
                    max_count = count[i];
                    max_value = i;
                }
                count[i] = 0;
            }
            System.out.println(max_value + " " + max_count);
        }

    }
}
