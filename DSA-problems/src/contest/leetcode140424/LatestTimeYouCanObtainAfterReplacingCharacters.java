package contest.leetcode140424;

public class LatestTimeYouCanObtainAfterReplacingCharacters {
    public String findLatestTime(String s) {
        char[] time = s.toCharArray();
        if (time[0] == '?') {
            if (time[1] == '?' || time[1] < '2') {
                time[0] = '1';
            } else {
                time[0] = '0';
            }
        }
        if (time[1] == '?') {
            if (time[0] == '1') {
                time[1] = '1';
            } else {
                time[1] = '9';
            }
        }
        if (time[3] == '?') {
            time[3] = '5';
        }
        if (time[4] == '?') {
            time[4] = '9';
        }
        return String.valueOf(time);
    }

    public static void main(String[] args) {
        System.out.println(new LatestTimeYouCanObtainAfterReplacingCharacters().findLatestTime("?3:12"));
    }
}
