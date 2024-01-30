package strings.easy;

import java.util.Scanner;

public class SumOfFirstDigitAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = Integer.toString(N);
        System.out.println(s);
        int firstDig = s.charAt(0) - '0';
        int lastDig = s.charAt(s.length() -1 ) - '0';
        System.out.println(firstDig + lastDig);

    }
}
