package leetcodedaily;

public class DeleteLeavesWithAGivenValue {
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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }
    public static void main(String[] args) {
        DeleteLeavesWithAGivenValue d = new DeleteLeavesWithAGivenValue();
        TreeNode root = d.new TreeNode(1);
        root.left = d.new TreeNode(2);
        root.right = d.new TreeNode(3);
        root.left.left = d.new TreeNode(2);
        root.right.left = d.new TreeNode(2);
        root.right.right = d.new TreeNode(4);
        System.out.println(d.removeLeafNodes(root, 2));
    }
}
