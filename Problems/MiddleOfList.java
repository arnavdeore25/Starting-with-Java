/*
Return the middle node of the linked list.
If there are two middle nodes then return the second middle node.
*/


class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class MiddleOfList {

    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }

        return first;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);

        System.out.print("Original List: ");
        printList(head);

        MiddleOfList solution = new MiddleOfList();
        ListNode middle = solution.middleNode(head);

        System.out.print("From Middle: ");
        printList(middle);
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next!=null?"-":""));
            current = current.next;
        }
        System.out.println();
    }
}
