package arrays;

//https://leetcode.com/problems/add-digits/description/

public class AddDigits {
    public static int addDigits(int num) {
        /*int sum = 0;
        if(num <= 9) return num;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);*/
        while (num > 9) {
            int sum = 0;
            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
