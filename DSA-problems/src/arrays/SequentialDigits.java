package arrays;

//https://leetcode.com/problems/sequential-digits/?envType=daily-question&envId=2024-02-02
// 1 12 123 1234 12345 123456 1234567 12345678 123456789
// 2 23 234 2345 23456 234567 2345678 23456789
// 3 34 345 3456 34567 345678 3456789
// 4 45 456 4567 45678 456789
// 5 56 567 5678 56789
// 6 67 678 6789
// 7 78 789
// 8 89
// 9

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            int num = i;
            for (int j = i + 1; j <= 9; j++) {
                num = num * 10 + j;
                if (num >= low && num <= high)
                    list.add(num);
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int low = 100;
        int high = 300;
        for (int num : sequentialDigits(low, high)) {
            System.out.print(num + " ");
        }
    }
}
