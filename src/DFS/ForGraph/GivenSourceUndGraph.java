package DFS.ForGraph;

import java.util.ArrayList;

public class GivenSourceUndGraph {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int v = 5; // nodes
        for(int i = 0; i < v; i++)// initialized adjacent list
        {
            adj.add(new ArrayList<>());
        }
    }
}

class dfsRec
{
    public static void recursive(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int source, ArrayList<Integer> res)
    {
        visited[source] = true; //in traverse time if source visited then store in res arraylist;
        res.add(source);

        for(int i : adj.get(source) ) //recursively visit all adjacent vertex
        {
            if(!visited[i]) // not visited node pass to recursive method
            {
                recursive(adj, visited, i, res);
            }
        }

    }

    public static void addEdges(ArrayList<ArrayList<Integer>> adj , int source, int tree)
    {
        adj.get(source).add(tree);
        adj.get(tree).add(source);
    }

    public static ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> res = new ArrayList<>();
        recursive(adj, visited, 0, res);
        return res;
    }


}
