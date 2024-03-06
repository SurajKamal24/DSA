package arrays.easy;

//https://www.geeksforgeeks.org/problems/key-pair5616/1

public class KeyPair {

    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        boolean[] found = new boolean[100001];
        for (int i = 0; i < n; i++) {
            int reqNum = x -  arr[i];
            if (reqNum >= 1 && reqNum <= 100000 && found[reqNum]) {
                return true;
            }
            found[arr[i]] = true;
        }
        return false;
    }

    public static void main(String[] args) {
        KeyPair k = new KeyPair();
        int N = 6, X = 16;
        int[] Arr = {1, 4, 45, 6, 10, 8};
        System.out.println(k.hasArrayTwoCandidates(Arr, N, X));
    }

}
