package LinkedList;

public class RotateList {

    public static class ListNode {
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

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        // Step 1: Find the length of the list
        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        // Step 2: Connect last node to the head to make it circular
        current.next = head;

        // Step 3: Find the new tail: (length - k % length - 1)th node
        int rotate = k % length;
        int stepsToNewHead = length - rotate;
        ListNode newTail = current;
        for (int i = 0; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        // Step 4: Set the new head and break the cycle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    // function to print list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null)
                System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.print("Original List: ");
        printList(head);

        ListNode rotated = rotateRight(head, k);
        System.out.print("Rotated List : ");
        printList(rotated);
    }
}
