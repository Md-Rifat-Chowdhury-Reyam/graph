package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Example1 {

    public static ArrayList<Integer> bfs (ArrayList<ArrayList<Integer>> adjMat)
    {
        int v = adjMat.size();
        int s = 0;

        ArrayList<Integer> reStore = new ArrayList<>();
        Queue<Integer> qu = new LinkedList<>();

        boolean[] visited = new boolean[v];
        visited[s] = true;
        qu.add(s);

        while(!qu.isEmpty())
        {
            int currNode = qu.poll();
            reStore.add(currNode);

            for(int x : adjMat.get(currNode))
            {
                if(!visited[x])
                {
                    visited[x] = true;
                    qu.add(x);
                }
            }
        }

        return reStore;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(1,4)));
        adj.add(new ArrayList<>(Arrays.asList(2,3)));

        ArrayList<Integer> ans = bfs(adj);

        for(int i :  ans)
        {
            System.out.print(i+ " ");
        }
    }
}