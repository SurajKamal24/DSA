package leetcodedaily;

public class DistributeCoinsInBinaryTree {
    private int moves = 0;
     public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
         }
     }
     private int dfs(TreeNode root) {
         if (root == null) {
             return 0;
         }
         int left = dfs(root.left);
         int right = dfs(root.right);
         moves += Math.abs(left) + Math.abs(right);
         return left + right + root.val - 1;
     }
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }
    public static void main(String[] args) {
        DistributeCoinsInBinaryTree d = new DistributeCoinsInBinaryTree();
        TreeNode root = d.new TreeNode(0);
        root.left = d.new TreeNode(3);
        root.right = d.new TreeNode(0);
        System.out.println(d.distributeCoins(root));
    }
}
