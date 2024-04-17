package leetcodedaily;

import java.sql.SQLOutput;

public class SmallestStringStartingFromLeaf {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void dfs(TreeNode node, StringBuilder current, StringBuilder smallest) {
        if (node == null) {
            return;
        }
        current.append((char) ('a' + node.val));
        if (node.left == null && node.right == null) {
            current.reverse();
            if (smallest.length() == 0 || (current.toString()).compareTo(smallest.toString()) < 0) {
                smallest.setLength(0);
                smallest.append(current.toString());
            }
            current.reverse();
        }
        dfs(node.left, current, smallest);
        dfs(node.right, current, smallest);
        current.setLength(current.length() - 1);
    }

    public String smallestFromLeaf(TreeNode root) {
        StringBuilder current = new StringBuilder();
        StringBuilder smallest = new StringBuilder();
        dfs(root, current, smallest);
        return smallest.toString();
    }
    
    public static void main(String[] args) {
        SmallestStringStartingFromLeaf s = new SmallestStringStartingFromLeaf();
        TreeNode root = s.new TreeNode(0);
        root.left = s.new TreeNode(1);
        root.right = s.new TreeNode(2);
        root.left.left = s.new TreeNode(3);
        root.left.right = s.new TreeNode(4);
        root.right.left = s.new TreeNode(3);
        root.right.right = s.new TreeNode(4);
        System.out.println(s.smallestFromLeaf(root));
    }
}
