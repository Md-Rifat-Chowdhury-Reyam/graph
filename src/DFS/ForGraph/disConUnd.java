package DFS.ForGraph;

import java.util.ArrayList;

public class disConUnd {
    public static void main(String[] args) {

    }

    public static void addEdges(ArrayList<ArrayList<Integer>> adjM, int s, int n)
    {
        adjM.get(s).add(n);
        adjM.get(n).add(s);
    }

    public static void recursive(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int s, ArrayList<Integer> res)
    {
        visited[s] = true;
        res.add(s);

       for(int i : adj.get(s))
       {
           if(!visited[i])
           {
               recursive(adj,visited, s, res);
           }
       }
    }

    public static ArrayList<Integer> dfsM(ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> res = new ArrayList<>();


        return res;

    }
}
