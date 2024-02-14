package strings.medium;

public class LengthOfTheLongestSubstring {

    static int longestUniqueSubsttr(String S){
        int n = S.length();
        int ans = 1;
        int i = 0;
        int j = 0;
        int[] freq = new int[26];
        freq[S.charAt(0)-'a']++;
        System.out.println("i ch " + S.charAt(i) + " j ch " + S.charAt(j));
        while(j<n-1) {
            j++;
            freq[S.charAt(j)-'a']++;
            while(freq[S.charAt(j)-'a']==2) {
                freq[S.charAt(i)-'a']--;
                i++;
            }
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(longestUniqueSubsttr(s));
    }

}
