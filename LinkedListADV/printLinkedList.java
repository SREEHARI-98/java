package LinkedListADV;

import java.util.ArrayList;

public class printLinkedList {
    public static ArrayList<Integer> PrintLinkedList(ListNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = A;
        while (temp != null) {
            ans.add(temp.val);
            temp = temp.next;
        }
        return ans;
    }
}
