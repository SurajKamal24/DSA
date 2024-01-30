package strings.medium;

import java.util.ArrayList;
import java.util.List;

public class MultiplyStrings {
    public static void multiply(String num1, String num2) {
        for (int i = num1.length() - 1; i >= 0; i--) {
            int carry = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = num2.length() - 1; j >= 0; j--) {
                int prod = Integer.parseInt(String.valueOf(num1.charAt(j))) * Integer.parseInt(String.valueOf(num2.charAt(i)));
                int val = prod % 10 + carry;
                carry = prod / 10;
                System.out.println("prod " + prod);
                System.out.println("val " + val);
                System.out.println("carry " + carry);
                sb.append(val);
            }
            String res = sb.reverse().toString();
            System.out.println(res);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String sentence = "the cattle was rattled by the battery";
        List<String> dictionary = new ArrayList<>(List.of("cat","bat","rat"));
        StringBuilder sb = new StringBuilder(sentence);



    }
}
