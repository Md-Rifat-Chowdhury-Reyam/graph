package DFS.ForGraph;

import java.util.ArrayList;

public class disConUnd {
    public static void main(String[] args) {

        int v= 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++)
        {
            adj.add(new ArrayList<>());
        }

        int[][] edges = { { 1, 2 }, { 2, 0 }, { 0, 3 }, { 4, 5 } };

        for (int[] i  : edges )
        {
            addEdges(adj, i[0],i[1] );
        }

        ArrayList<Integer> res = dfs(adj);

        for(int i : res)
        {
            System.out.print(i + " ");
        }

    }

    public static void addEdges(ArrayList<ArrayList<Integer>> adj, int a, int b)
    {
        adj.get(a).add(b);
        adj.get(b).add(a);
    }

    public static void recur(ArrayList<ArrayList<Integer>> adj , boolean[] visited, int s, ArrayList<Integer> res)
    {
        visited[s] = true;
        res.add(s);

        // recursive not visited
        for(int i : adj.get(s))
        {
            if(!visited[i])
            {
                recur(adj, visited, i , res);
            }
        }
    }

    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited =  new boolean[adj.size()];
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < adj.size();i++)
        {
            if(!visited[i])
            {
                recur(adj, visited, i , res);
            }
        }

        return res;
    }
}
