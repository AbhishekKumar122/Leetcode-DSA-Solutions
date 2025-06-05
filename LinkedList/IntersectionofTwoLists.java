package LinkedList;

public class IntersectionofTwoLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            // if end is reached, jump to other head
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        // either the intersection node or null
        return a;
    }

    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // List A: 4 -> 1 -> [8 -> 4 -> 5]
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // List B: 5 -> 6 -> 1 -> [8 -> 4 -> 5]
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        IntersectionofTwoLists sol = new IntersectionofTwoLists();
        ListNode intersection = sol.getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersected at '" + intersection.val + "'");
        } else {
            System.out.println("No intersection");
        }
    }
}
