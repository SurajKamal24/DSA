package contest.weeklycontest405;

public class FindTheEncryptedString {
    public String getEncryptedString(String s, int k) {
        char[] given = s.toCharArray();
        char[] result = new char[given.length];
        for (int i = 0; i < given.length; i++) {
            result[i] = given[(i + k) % given.length];
        }
        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(new FindTheEncryptedString().getEncryptedString("dart", 3));
    }
}
