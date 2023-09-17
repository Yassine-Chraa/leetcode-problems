//In this problem we don't need to use a sort algorithm just divide array into buckets

class Solution {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class MyLinkedList {
        Node head;
    }

    public void sortColors(int[] nums) {
        if(nums.length<=1) return;
        MyLinkedList[] buckets = new MyLinkedList[3];
        int k = 0;
        Node temp,temp0,temp1,temp2,newNode;

        // Initialize the LinkedList objects
        for (int i = 0; i < 3; i++) {
            buckets[i] = new MyLinkedList();
        }
        temp0 = buckets[0].head;
        temp1 = buckets[1].head;
        temp2 = buckets[2].head;
        for(int i=0;i<nums.length;i++){
            newNode = new Node(nums[i]);
            switch(nums[i]){
                case 0:
                    if(temp0 != null) temp0 = temp0.next = newNode;
                    else buckets[0].head = temp0 = newNode;
                    break;
                case 1:
                    if(temp1 != null) temp1.next = temp1 = newNode;
                    else buckets[1].head = temp1 = newNode;
                    break;
                case 2:
                    if(temp2 != null) temp2.next = temp2 = newNode;
                    else buckets[2].head = temp2 = newNode;
                    break;
                default:
                    break;
            }
        }
        for(int i=0;i<3;i++){
            temp = buckets[i].head;
            while(temp != null){
                nums[k++] = temp.data;
                temp = temp.next;
            }
        }  
    }
}