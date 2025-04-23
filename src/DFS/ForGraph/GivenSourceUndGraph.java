package DFS.ForGraph;

import java.util.ArrayList;

public class GivenSourceUndGraph {

    public static void main(String[] args) {

    }
}

class dfsRec
{
    public static void Recursive(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int source, ArrayList<Integer> res)
    {
        visited[source] = true; //in traverse time if source visited then store in res arraylist;
        res.add(source);


    }
}
