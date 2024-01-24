package arrays;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int totalWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                totalWealth += accounts[i][j];
            }
            if (totalWealth > maxWealth)
                maxWealth = totalWealth;
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

}
