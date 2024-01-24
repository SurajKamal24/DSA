package arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return  digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] result = new int[digits.length +1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        for (int num : plusOne(digits)) {
            System.out.print(num + " ");
        }
    }
}
