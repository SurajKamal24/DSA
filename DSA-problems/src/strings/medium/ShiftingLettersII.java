package strings.medium;

//https://leetcode.com/problems/shifting-letters-ii/description/

public class ShiftingLettersII {

    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] arr = new int[n + 1];
        for (int i = 0; i < shifts.length; i++) {
            int start = shifts[i][0];
            int end = shifts[i][1];
            int dir = shifts[i][2];
            if (dir == 1) {
                arr[start]++;
                arr[end + 1]--;
            } else {
                arr[start]--;
                arr[end + 1]++;
            }
        }
        for (int i = 1; i <= n; i++) {
            arr[i] += arr[i - 1];
        }
        char[] charArray = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int shiftedIndex = (charArray[i] - 'a' + arr[i]) % 26;
            if (shiftedIndex < 0) {
                shiftedIndex += 26;
            }
            charArray[i] = (char) ('a' + shiftedIndex);
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        ShiftingLettersII s = new ShiftingLettersII();
        String str = "abc";
        int[][] shifts = {{0,1,0}, {1,2,1}, {0,2,1}};
        System.out.println(s.shiftingLetters(str, shifts));
    }

}
