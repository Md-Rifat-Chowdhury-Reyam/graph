package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Example2
{

    //bfs of disconnected graph
    public static ArrayList<Integer> bfsGraph(ArrayList<ArrayList<Integer>> adjMat, int source, boolean[] visited, ArrayList<Integer> res)
    {
        //create a queue;
        Queue<Integer> q = new LinkedList<>();

        visited[source] = true;
        q.add(source);

        while (!q.isEmpty())
        {
            int curr = q.poll();
            res.add(curr);

            for(int x : adjMat.get(curr))
            {
                if(!visited[x])
                {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
        return res;
    }

    public static ArrayList<Integer> bfsDis(ArrayList<ArrayList<Integer>> adjMat)
    {
        int v = adjMat.size();

        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[v];

        for(int i = 0; i < v; i++)
        {
            if(!visited[i])
            {
                bfsGraph(adjMat,i, visited,res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(4)));
        adj.add(new ArrayList<>(Arrays.asList(3, 5)));
        adj.add(new ArrayList<>(Arrays.asList(4)));

        int src = 0;
        ArrayList<Integer> ans = bfsDis(adj);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

}

