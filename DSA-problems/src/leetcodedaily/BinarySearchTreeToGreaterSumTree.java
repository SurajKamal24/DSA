package leetcodedaily;

public class BinarySearchTreeToGreaterSumTree {
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
    private int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if (root != null) {
            bstToGst(root.right);
            sum += root.val;
            root.val = sum;
            bstToGst(root.left);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new BinarySearchTreeToGreaterSumTree().new TreeNode(4);
        root.left = new BinarySearchTreeToGreaterSumTree().new TreeNode(1);
        root.right = new BinarySearchTreeToGreaterSumTree().new TreeNode(6);
        root.left.left = new BinarySearchTreeToGreaterSumTree().new TreeNode(0);
        root.left.right = new BinarySearchTreeToGreaterSumTree().new TreeNode(2);
        root.left.right.right = new BinarySearchTreeToGreaterSumTree().new TreeNode(3);
        root.right.left = new BinarySearchTreeToGreaterSumTree().new TreeNode(5);
        root.right.right = new BinarySearchTreeToGreaterSumTree().new TreeNode(7);
        root.right.right.right = new BinarySearchTreeToGreaterSumTree().new TreeNode(8);
        new BinarySearchTreeToGreaterSumTree().bstToGst(root);
    }
}
