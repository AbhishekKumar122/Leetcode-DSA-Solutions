package Tree;

import java.util.Stack;

public class KthSmallestElement {

    // Definition for a binary tree node.
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

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        int n = 0;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            n++;
            if (n == k) {
                return curr.val;
            }
            curr = curr.right;
        }

        return -1;
    }

    public static void main(String[] args) {
        KthSmallestElement obj = new KthSmallestElement();
        TreeNode root = obj.new TreeNode(5);
        root.left = obj.new TreeNode(3);
        root.right = obj.new TreeNode(6);
        root.left.left = obj.new TreeNode(2);
        root.left.right = obj.new TreeNode(4);
        root.left.left.left = obj.new TreeNode(1);

        int k = 3;
        int result = obj.kthSmallest(root, k);
        System.out.println("The " + k + "rd smallest element in BST is: " + result);
    }
}
