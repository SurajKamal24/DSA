package strings.medium;

//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    private static int isVowel(char c) {
        if(c=='a') return 1;
        if(c=='e') return 1;
        if(c=='i') return 1;
        if(c=='o') return 1;
        if(c=='u') return 1;
        return 0;
    }

    public static int maxVowels(String s, int k) {
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += isVowel(s.charAt(i));
        }
        int ans = curr;
        for (int i = k; i < s.length(); i++) {
            curr = curr - isVowel(s.charAt(i-k)) + isVowel(s.charAt(i));
            ans = Math.max(ans, curr);
        }
        return ans;
    }


    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

}
