package BFS;

import java.util.ArrayList;
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




        return reStore;
    }

    public static void main(String[] args) {

    }
}