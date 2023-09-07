class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp;
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}