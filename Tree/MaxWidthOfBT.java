package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfBT {

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Pair class to hold node and its index
    static class Pair {
        TreeNode node;
        int index;

        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    // Function to calculate maximum width
    public static int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int maxWidth = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            int size = queue.size();
            int minIndex = queue.peek().index;
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair current = queue.poll();
                int currIndex = current.index - minIndex;
                TreeNode node = current.node;

                if (i == 0)
                    first = currIndex;
                if (i == size - 1)
                    last = currIndex;

                if (node.left != null)
                    queue.offer(new Pair(node.left, 2 * currIndex));
                if (node.right != null)
                    queue.offer(new Pair(node.right, 2 * currIndex + 1));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        int maxWidth = widthOfBinaryTree(root);
        System.out.println("Maximum width of the binary tree is: " + maxWidth);
    }
}
