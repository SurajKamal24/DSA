package binarysearch.easy;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        int l = 0, r = letters.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (letters[mid] > target) {
                ans = letters[mid];
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        FindSmallestLetterGreaterThanTarget f = new FindSmallestLetterGreaterThanTarget();
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(f.nextGreatestLetter(letters, target));
    }
}
