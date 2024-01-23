package arrays;

import java.util.Scanner;

public class NonDecreasingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test_cases = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();

        while (test_cases-- > 0) {
            int n = scanner.nextInt();
            long prev = scanner.nextLong();
            stringBuilder.append(prev + " ");
            long rem = 0, diff = 0;
            for (int i = 1; i < n; i++) {
                long curr = scanner.nextLong();
                if (curr > prev) {
                    stringBuilder.append(curr + " ");
                }
                else {
                    rem = prev % curr;
                    diff = rem == 0 ? 0 : curr - rem;
                    curr = diff + prev;
                    stringBuilder.append(curr + " ");
                }
                prev = curr;
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
