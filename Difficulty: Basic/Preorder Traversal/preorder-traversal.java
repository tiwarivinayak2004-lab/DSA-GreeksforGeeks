/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> preorder=new ArrayList<>();
        preOrder2(preorder,root);
        return preorder;
        
    }
    public void preOrder2(ArrayList<Integer> arr,Node root){
        
        if(root==null) return;
        
        arr.add(root.data);
        preOrder2(arr,root.left);
        preOrder2(arr,root.right);
    }
}