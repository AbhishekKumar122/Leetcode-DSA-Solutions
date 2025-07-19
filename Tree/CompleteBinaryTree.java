package Tree;

import java.util.*;

public class CompleteBinaryTree {

    // Definition for a binary tree node.
    static class TreeNode {
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

    public static boolean isCompleteTree(TreeNode root) {
        if (root == null)
            return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean foundNull = false;

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current == null) {
                foundNull = true;
            } else {
                if (foundNull)
                    return false; // Found a non-null after null — not complete
                queue.offer(current.left);
                queue.offer(current.right);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println("Is the binary tree complete?: " + isCompleteTree(root)); // Output: true

    }
}
