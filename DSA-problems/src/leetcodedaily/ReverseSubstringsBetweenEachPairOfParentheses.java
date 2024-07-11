package leetcodedaily;

public class ReverseSubstringsBetweenEachPairOfParentheses {
    int i = 0;
    private String helper(char[] arr) {
        StringBuilder sb = new StringBuilder();
        while (i < arr.length) {
            if (arr[i] == ')') {
                i++;
                return sb.reverse().toString();
            } else if (arr[i] == '(') {
                i++;
                String s = helper(arr);
                sb.append(s);
            } else {
                sb.append(arr[i]);
                i++;
            }
        }
        return sb.toString();
    }
    public String reverseParentheses(String s) {
        char[] arr = s.toCharArray();
        return helper(arr);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseSubstringsBetweenEachPairOfParentheses().reverseParentheses("(u(love)i)"));
    }
}
