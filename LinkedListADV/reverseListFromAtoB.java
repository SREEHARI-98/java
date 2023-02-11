package LinkedListADV;

class reverseListFromAtoB{
    
    public static void main(String[] args) {
        ListNode A = new ListNode(7);
        A.next = new ListNode(8);
        A.next.next = new ListNode(9);

        System.out.println(printLinkedList.PrintLinkedList(A));
    }
}