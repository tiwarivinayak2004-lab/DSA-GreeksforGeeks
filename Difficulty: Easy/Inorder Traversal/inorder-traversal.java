/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> inorder=new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node node=root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                else{
                    node=st.pop();
                    inorder.add(node.data);
                    node=node.right;
                }
            }
        }
        return inorder;
    }
}