package DFS.ForGraph;

import java.util.ArrayList;

public class disConUnd {
    public static void main(String[] args) {

        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        //initialize adjacent list
        for(int i = 0; i < v; i++)
        {
            adj.add(new ArrayList<>());
            System.out.print(adj.get(i));

        }
        System.out.println();

        int[][] edges = {{ 1, 2 }, { 2, 0 }, { 0, 3 }, { 4, 5 } };
        for (int[] i : edges)
        {
            addEdges(adj, i[0], i[1]);

        }

        ArrayList<Integer> res = dfsM(adj);
        for(int i : res)
        {
            System.out.print( i + " ");
        }


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
               recursive(adj,visited, i, res);
           }
       }
    }

    public static ArrayList<Integer> dfsM(ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < adj.size(); i++ )
        {
            if(!visited[i])
            {
                recursive(adj,visited, i, res);
            }
        }

        return res;

    }
}
