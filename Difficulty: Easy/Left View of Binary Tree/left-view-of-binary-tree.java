/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> ans= new ArrayList<>();
    public ArrayList<Integer> leftView(Node root) {
        // code here
        
        dfs(root,0);
        return ans;
    }
    public void dfs(Node root,int level)
    {
        if(root==null) return;
        if(level==ans.size())
        {
            ans.add(root.data);
        }
        if(root.left!=null)
        {
            dfs(root.left,level+1);
        }
        if(root.right!=null)
        {
            dfs(root.right,level+1);
        }
    }
}