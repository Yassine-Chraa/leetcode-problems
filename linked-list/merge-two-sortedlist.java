/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode(-1);
        ListNode current = newList;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
        current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return newList.next;
    }

    ublic ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode newList = list1;
        ListNode temp=null,prev=null;
        while(list2 != null && list1 != null){
            if(list2.val<=list1.val){
                temp = list2.next;
                if(prev!=null){
                   prev.next = list2;
                   prev.next.next = list1;
                   prev = list2;
                }else{
                    newList = list2;
                    prev = list2;
                    prev.next = list1;
                }
                list2 = temp;
            }else{
                prev = list1;
                list1 = list1.next;
            }
        }

        if(list1 != null){
            if(prev != null) prev.next = list1;
        }
        if(list2 != null){
            if(prev != null) prev.next = list2;
            else return list2;
        }

        return newList;
    }

}