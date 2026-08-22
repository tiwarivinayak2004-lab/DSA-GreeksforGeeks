/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        
        // code here
        if(head==null){
            Node newNode=new Node(0);
            newNode.data=x;
            newNode.next=null;
            return newNode;
        }
        Node temp;
        int cnt=0;
        for(temp=head;temp.next!=null;temp=temp.next)
        {
            cnt++;
        }
        Node newNode=new Node(x);
        temp.next=newNode;
        // newNode.data=x;
        newNode.next=null;
        return head;
    }
}