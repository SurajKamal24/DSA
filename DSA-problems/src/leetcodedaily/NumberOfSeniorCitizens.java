package leetcodedaily;

public class NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        int res = 0;
        for (String s : details) {
            if (Integer.parseInt(s.substring(11, 13)) > 60) {
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new NumberOfSeniorCitizens().countSeniors(new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"}));
    }
}
