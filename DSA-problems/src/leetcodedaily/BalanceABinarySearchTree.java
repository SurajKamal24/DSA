package leetcodedaily;

import java.util.ArrayList;
import java.util.List;

public class BalanceABinarySearchTree {
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
    List<TreeNode> nodes = new ArrayList<>();
    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return ;
        }
        inOrderTraversal(root.left);
        nodes.add(root);
        inOrderTraversal(root.right);
    }
    private TreeNode toBST(int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = nodes.get(mid);
        node.left = toBST(start, mid - 1);
        node.right = toBST(mid + 1, end);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        inOrderTraversal(root);
        return toBST(0, nodes.size() - 1);
    }
    public static void main(String[] args) {
        BalanceABinarySearchTree.TreeNode root = new BalanceABinarySearchTree().new TreeNode(1);
        root.right = new BalanceABinarySearchTree().new TreeNode(2);
        root.right.right = new BalanceABinarySearchTree().new TreeNode(3);
        root.right.right.right = new BalanceABinarySearchTree().new TreeNode(4);
        new BalanceABinarySearchTree().balanceBST(root);
    }
}
