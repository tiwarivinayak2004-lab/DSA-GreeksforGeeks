/* Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
     public boolean isSumTree(Node node) {
        // code here
        return checkSumTree(node)!=-1;
    }
    public int checkSumTree(Node root){
        if(root==null) return 0;
        
        if(root.left==null && root.right==null){
            return root.data;
        }
        
        int leftSum=checkSumTree(root.left);
        
        if(leftSum==-1){
            return -1;
        }
        
        int rightSum=checkSumTree(root.right);
        if(rightSum==-1){
            return -1;
        }
        if(leftSum+rightSum != root.data){
            return -1;
        }
        return rightSum+leftSum+root.data;
    }
}