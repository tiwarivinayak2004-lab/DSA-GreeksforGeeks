/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node d1=head1;
        Node d2=head2;
        while(d1!=d2){
            d1=d1==null?head2:d1.next;
            d2=d2==null?head1:d2.next;
        }
        return d1;
    }
}