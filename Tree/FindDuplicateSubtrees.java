package Tree;

import java.util.*;

public class FindDuplicateSubtrees {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        };

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        serialize(root);
        return result;
    }

    public String serialize(TreeNode node) {
        if (node == null) {
            return "#";
        }
        // post order traversal
        String serial = node.val + "," + serialize(node.left) + serialize(node.right);

        // update frequency in map
        map.put(serial, map.getOrDefault(serial, 0) + 1);

        // If it's seen exactly twice, it's a duplicate (add to result)
        if (map.get(serial) == 2) {
            result.add(node);
        }
        return serial;
    }

    private static void printResult(List<TreeNode> nodes) {
        for (TreeNode node : nodes) {
            System.out.println("Duplicates subtrees are: " + node.val);
        }
    }

    public static void main(String[] args) {
        FindDuplicateSubtrees fds = new FindDuplicateSubtrees();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(3);

        List<TreeNode> duplicates = fds.findDuplicateSubtrees(root);
        printResult(duplicates);
    }

}