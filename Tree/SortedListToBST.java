
package Tree;

public class SortedListToBST {

    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Definition for a binary tree node.
    class TreeNode {
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

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return new TreeNode(head.val);

        // Find middle of list
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Disconnect left half from mid
        if (prev != null)
            prev.next = null;

        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head == slow ? null : head); // left list
        root.right = sortedListToBST(slow.next); // right list

        return root;
    }

    public static void main(String[] args) {
        SortedListToBST sltb = new SortedListToBST();

        // Build linked list: [-10, -3, 0, 5, 9]
        ListNode head = sltb.new ListNode(-10);
        head.next = sltb.new ListNode(-3);
        head.next.next = sltb.new ListNode(0);
        head.next.next.next = sltb.new ListNode(5);
        head.next.next.next.next = sltb.new ListNode(9);

        TreeNode root = sltb.sortedListToBST(head);

        // In-order print to verify correctness
        sltb.inOrderPrint(root); // Expected: -10 -3 0 5 9
    }

    void inOrderPrint(TreeNode root) {
        if (root == null)
            return;
        inOrderPrint(root.left);
        System.out.print(root.val + " ");
        inOrderPrint(root.right);
    }

}
