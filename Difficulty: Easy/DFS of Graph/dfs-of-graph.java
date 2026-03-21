class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n=adj.size();
        boolean vis[]=new boolean[n+1];
        vis[0]=true;
        ArrayList<Integer> res=new ArrayList<>();
        dfs2(0,vis,adj,res);
        return res;
    }
    public static void dfs2(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res)
    {
        vis[node]=true;
        res.add(node);
        
        for(Integer it: adj.get(node)){
            if(vis[it]==false){
                dfs2(it,vis,adj,res);
            }
        }
    }
}