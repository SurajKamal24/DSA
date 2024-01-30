package strings.easy;

import java.util.Scanner;

public class MostRecurringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[256];
        int maxFreq = -1;
        char maxChar = ' ';
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
            if(freq[s.charAt(i)] > maxFreq) {
                maxFreq = freq[s.charAt(i)];
                maxChar = s.charAt(i);
            }
        }
        System.out.println(maxChar);

    }
}
