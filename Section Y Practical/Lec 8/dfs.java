import java.util.*;
class DFS {
    
    
    public static void dfs(Integer node, Integer vis[], ArrayList < ArrayList < Integer >> adj ) {
        vis[node]= 1;
        System.out.print(node+" ");
        for(Integer itr: adj.get(node)){
            if(vis[itr]==0){
                dfs(itr, vis, adj);
            }
        }
    }
    public static void main(String args[]) {

        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);
        
        Integer vis[]= new Integer[5];
        vis[0]= 0;
        vis[1]= 0;
        vis[2]= 0;
        vis[3]= 0;
        vis[4]= 0;
        dfs(0, vis, adj);
        
    }
}