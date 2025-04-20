package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Example1 {

    //create a source node
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adjMat)
    {
        //vertex size;
        int v = adjMat.size();
        int s = 0; // initialize source to zero;

        //create an array to store the traversal;
        ArrayList<Integer> res = new ArrayList<>();
        //create a queue  for bfs;
        Queue<Integer> qu = new LinkedList<>();

        //Initially mark the vertices they are not visited by boolean array;
        boolean[] visited = new boolean [v];
        // Mark the source node or vertex as visited;
        visited[s] = true;
        // add source node in queue;
        qu.add(s);

        //Iterate over the queue;
        //while use for check first condition;
        while (!qu.isEmpty()) {

            // Dequeue a vertex from queue and store it
            int curr = qu.poll();
            res.add(curr);

            // Get all adjacent vertices of the dequeued
            // vertex curr If an adjacent has not been
            // visited, mark it visited and enqueue it
            for (int x : adjMat.get(curr)) {
                if (!visited[x]) {
                    visited[x] = true;
                    qu.add(x);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {


        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(1,4)));
        adj.add(new ArrayList<>(Arrays.asList(2,3)));

        ArrayList<Integer> adjM = bfs(adj);
        for(int i : adjM)
        {
            System.out.print(i + " ");
        }
    }

}
