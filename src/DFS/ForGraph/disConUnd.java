package DFS.ForGraph;

import java.util.ArrayList;

public class disConUnd {
    public static void main(String[] args) {

    }

    public static void addEdges(ArrayList<ArrayList<Integer>> adj, int a, int b)
    {
        adj.get(a).add(b);
        adj.get(b).add(a);
    }


}
