package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class InbuiltSort {

    void sort(Integer[] arr) {
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer e1, Integer e2) {
                if(e1.intValue() > e2.intValue())
                    return -1;
                if(e1.equals(e2))
                    return 0;
                return 1;
                // negative if e1 to come before e2 in sorting
                // zero if according to comparator, both are equal
                // positive if e1 to come after e2 in sorting
            }
        };
        Arrays.sort(arr, cmp);
    }


    public static void main(String[] args) {
        InbuiltSort i = new InbuiltSort();
        Integer[] arr = {4, 1, 3, 9, 7};
        int N = 5;
        i.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
