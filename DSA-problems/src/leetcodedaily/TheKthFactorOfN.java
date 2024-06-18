package leetcodedaily;

import java.util.ArrayList;
import java.util.List;

public class TheKthFactorOfN {
    //With List
    /*public int kthFactor(int n, int k) {
        List<Integer> factorList = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorList.add(i);
                if (factorList.size() == k) {
                    return factorList.get(k - 1);
                }
            }
        }
        return -1;
    }*/
    //Without List
    public int kthFactor(int n, int k) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new TheKthFactorOfN().kthFactor(12, 3));
    }
}
