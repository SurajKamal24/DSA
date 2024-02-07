package arrays;

//https://leetcode.com/problems/pascals-triangle/description/

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                if (j == 0 || j == i) {
                    list.add(j,1);
                } else {
                    list.add(pascalList.get(i-1).get(j-1) + pascalList.get(i-1).get(j));
                }
            }
            pascalList.add(i, list);
        }
        return pascalList;
    }

    public static void main(String[] args) {
        for (List list : generate(3)) {
            System.out.println(list);
        }
    }
}
