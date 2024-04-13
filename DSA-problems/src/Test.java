public class Test {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int totalSecs = 0;
        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    totalSecs++;
                }
                if (tickets[k] == 0) {
                    break;
                }
            }
        }
        return totalSecs;
    }

    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[]{2,3,2}, 2));
    }
}
