package leetcodedaily;

import java.util.ArrayList;
import java.util.List;

public class FindTheWinnerOfTheCircularGame {
    public int findTheWinner(int n, int k) {
        /*List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int index = 0;
        while(list.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                index = (index + 1) % list.size();
            }
            list.remove(index);
        }
        return list.get(0);*/
        //Formula approach
        int winner=0;
        for (int i = 1; i <= n; i++) {
            winner = (winner + k) % i;
        }
        return winner + 1;
    }
    public static void main(String[] args) {
        System.out.println(new FindTheWinnerOfTheCircularGame().findTheWinner(5, 2));
    }
}
