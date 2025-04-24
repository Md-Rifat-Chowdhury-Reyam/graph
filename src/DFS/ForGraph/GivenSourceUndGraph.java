package DFS.ForGraph;

import java.util.ArrayList;

public class GivenSourceUndGraph {

    public static void main(String[] args) {

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


}
