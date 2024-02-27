package strings.medium;

//https://leetcode.com/problems/count-vowel-strings-in-ranges/description/

public class CountVowelStringsInRanges {

    public boolean isVowel(char x) {
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prev = new int[n];
        for (int i = 0; i < n; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                prev[i] = 1;
            } else {
                prev[i] = 0;
            }
            if (i >= 1) {
                prev[i] += prev[i-1];
            }
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if (l == 0) {
                ans[i] = prev[r];
            } else {
                ans[i] = prev[r] - prev[l - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0,2}, {1,4}, {1,1}};
        CountVowelStringsInRanges c = new CountVowelStringsInRanges();
        for (int num : c.vowelStrings(words, queries)) {
            System.out.print(num + " ");
        }
    }

}
