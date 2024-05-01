package leetcodedaily;

public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        /*StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (char c : word.toCharArray()) {
            sb.append(c);
            if (c == ch && flag) {
                sb.reverse();
                flag = false;
            }
        }
        return sb.toString();*/

        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        StringBuilder sb = new StringBuilder(word.substring(0, index + 1));
        return sb.reverse().toString() + word.substring(index + 1);
    }

    public static void main(String[] args) {
        System.out.println(new ReversePrefixOfWord().reversePrefix("abcdef", 'd'));
    }
}
