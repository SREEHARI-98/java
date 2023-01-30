package LinkedListADV;

import java.util.*;
public class kReverse {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int d){
            val = d;
            next = null;
        }
    }
    public static void main(String args[]){
        ListNode A = new ListNode(1);
        A.next = new ListNode(2);
        A.next.next = new ListNode(3);
        A.next.next.next = new ListNode(4);
        A.next.next.next.next = new ListNode(5);
        A.next.next.next.next.next = new ListNode(6);

        System.out.println(printLinkedList(reverseList(A, 3)));
    }
    public static ListNode reverseList(ListNode head, int B) {
        if(B == 1 || head == null || head.next == null)
            return head;
        ListNode h1 = head;
        ListNode h2 = head.next;
        int count = 1;
        while(h2 != null && count < B){
            ListNode temp = h2.next;
            h2.next = h1;
            h1 = h2;
            h2 = temp;
            count++;
        }
        head.next = reverseList(h2,B);
        return h1;
    }
    public static ArrayList<Integer> printLinkedList(ListNode A){
        ArrayList<Integer> ans = new ArrayList<>();
        while(A != null){
            ans.add(A.val);
            A = A.next;
        }
        return ans;
    }
}
