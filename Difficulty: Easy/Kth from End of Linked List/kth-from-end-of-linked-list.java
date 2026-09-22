/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node dummy=new Node(0);
        dummy.next=head;
        Node temp=head;
        
        int n=0;
        while(temp!=null) {
            n++;
            temp=temp.next;
        }
        if(n<k) return -1;
        
        Node slow=dummy;
        Node fast=dummy;
        
        for(int i=0;i<=k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow=slow.next;
        if(slow==null) return -1;
        
        return slow.data;
    }
}