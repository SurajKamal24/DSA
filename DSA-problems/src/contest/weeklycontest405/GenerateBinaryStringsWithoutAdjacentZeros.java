package contest.weeklycontest405;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringsWithoutAdjacentZeros {
    private void generateStrings(int n, String s, List<String> result) {
        if (s.length() == n) {
            result.add(s);
            return;
        }
        if (s.length() == 0 || s.charAt(s.length() - 1) == '1') {
            generateStrings(n, s + "0", result);
        }
        generateStrings(n, s + "1", result);
    }
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        generateStrings(n, "", result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new GenerateBinaryStringsWithoutAdjacentZeros().validStrings(3));
    }
}
