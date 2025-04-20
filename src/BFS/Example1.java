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
        Boolean[] visited = new Boolean [v];
        visited[s] = true;// Mark the source node or vertex as visited;
        qu.add(s); // add source node in queue;

        //Iterate over the queue;
        //while use for check first condition;
        while(!qu.isEmpty())
        {
            int curr = qu.poll(); // current value of vertex dequeue from queue;
            res.add(curr); // store in res array;

            //get all adjacent vertices of the dequeue;
            for(int x : adjMat.get(curr))
            {
                if(!visited[x])// visited node inverted
                {
                    visited[x] = true; // visited node true then -->
                    // add in queue;
                    qu.add(x);
                }
                System.out.println();

            }
            System.out.println();

        }

        return res;
    }

    public static void main(String[] args) {


        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(0,1)));
        adj.add(new ArrayList<>(Arrays.asList(0,3)));
        adj.add(new ArrayList<>(Arrays.asList(0,2,3)));
        adj.add(new ArrayList<>(Arrays.asList(1,4,3)));

        ArrayList<Integer> adjM = bfs(adj);
        for(int i : adjM)
        {
            System.out.println(i + " ");
        }
    }

}
