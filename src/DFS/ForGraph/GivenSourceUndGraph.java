package DFS.ForGraph;

import java.util.ArrayList;

public class GivenSourceUndGraph extends dfsRec {

    public static void main(String[] args) {


        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int v = 6; // nodes
        for(int i = 0; i < v; i++)// initialized adjacent list
        {
            adj.add(new ArrayList<>());
        }




        int[][] edges = { { 1, 2 }, { 2, 0 }, { 0, 3 },{3,4}, { 4, 5 } };
        for(int[] i  : edges)
        {
            addEdges(adj, i[0], i[1]);

        }
        ArrayList<Integer> res = DFS(adj);

       for(int i : res)
       {
           System.out.print(i +" ");
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
