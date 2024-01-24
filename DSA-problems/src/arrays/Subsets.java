package arrays;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());

        for (int st = 0; st < arr.length; st++) {
            for (int en = st; en < arr.length; en++) {
                List<Integer> list = new ArrayList<>();
                for (int i = st; i <= en; i++) {
                    list.add(arr[i]);
                }
                lists.add(list);
            }
        }
        for (List<Integer> list : lists) {
            System.out.println(list + "");
        }


    }

}
