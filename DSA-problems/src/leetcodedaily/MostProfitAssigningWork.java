package leetcodedaily;

public class MostProfitAssigningWork {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int totalProfit = 0;
        for (int i = 0; i < worker.length; i++) {
            int maxProfitForWorker = 0;
            for (int j = 0; j < difficulty.length; j++) {
                if (worker[i] >= difficulty[j]) {
                    maxProfitForWorker = Math.max(maxProfitForWorker, profit[j]);
                }
            }
            totalProfit += maxProfitForWorker;
        }
        return totalProfit;
    }
    public static void main(String[] args) {
        System.out.println(new MostProfitAssigningWork().maxProfitAssignment(new int[]{7, 20, 68}, new int[]{26, 28, 57}, new int[]{71, 20, 71}));
    }
}
