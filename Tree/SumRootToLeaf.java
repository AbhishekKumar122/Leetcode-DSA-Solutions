package Tree;

public class SumRootToLeaf {
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

    private static int result = 0;

    public static int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return result;
    }

    private static void dfs(TreeNode cur, int prevNumber) {
        if (cur == null) {
            return;
        }
        int curNumber = prevNumber * 10 + cur.val;
        if (cur.left == null && cur.right == null) {
            result += curNumber;
            return;
        }

        dfs(cur.left, curNumber);
        dfs(cur.right, curNumber);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        int sum = sumNumbers(root);
        System.out.println("Sum of root-to-leaf numbers: " + sum);
    }
}
