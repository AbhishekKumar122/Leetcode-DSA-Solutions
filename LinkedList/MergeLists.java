package LinkedList;

public class MergeLists {

    // Definition for singly-linked list.
    public class ListNode {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    // Printing list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeLists ml = new MergeLists();

        // Manually creating two sorted linked lists
        ListNode list1 = ml.new ListNode(1);
        list1.next = ml.new ListNode(3);
        list1.next.next = ml.new ListNode(5);

        ListNode list2 = ml.new ListNode(2);
        list2.next = ml.new ListNode(4);
        list2.next.next = ml.new ListNode(6);

        // Merge and print the result
        ListNode mergedList = ml.mergeTwoLists(list1, list2);
        System.out.print("Merged List: ");
        ml.printList(mergedList);
    }
}
