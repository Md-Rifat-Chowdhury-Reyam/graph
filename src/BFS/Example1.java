package BFS;

import java.util.ArrayList;
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


        return res;

    }

}
