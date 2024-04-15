package leetcodedaily;

public class SumRootToLeafNumbers {
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
    public int helper(TreeNode node, int sum) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) {
            return sum * 10 + node.val;
        }
        return helper(node.left, sum * 10 + node.val) + helper(node.right, sum * 10 + node.val);
    }
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    public static void main(String[] args) {
        SumRootToLeafNumbers s = new SumRootToLeafNumbers();
        TreeNode root = s.new TreeNode(1);
        root.left = s.new TreeNode(2);
        root.right = s.new TreeNode(3);
        System.out.println(s.sumNumbers(root));
    }
}
