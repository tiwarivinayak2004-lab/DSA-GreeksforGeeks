/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public boolean isBST(Node root) {
        // code here
        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean validate(Node root,long min,long max){
        if(root==null) return true;
        
        if(root.data<=min || root.data>=max) return false;
        
        return validate(root.left,min,root.data) && validate(root.right,root.data,max);
    }
}