package Adjacency.List.Edges;

import java.util.Vector;

public class AddRmEdgAdjList {

    static void addEdges(Vector<Integer>[] adjList, int x, int y)
    {
        adjList[x].add(y);
        adjList[y].add(x);
    }

    static void displayEdges(Vector<Integer>[] adjList, int v)
    {
        for (int i = 0; i < v; i++)
        {
            System.out.println("Vertex" + v);
            for(Integer x : adjList[v])
            {
                System.out.println("->" + x);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        int v = 4;
        Vector<Integer>[] adjL = new Vector[v];
        for(int i = 0; i < v; i++)
        {
            adjL[i] = new Vector<Integer>();
        }

        addEdges(adjL,0,1);
        addEdges(adjL,0,2);
        addEdges(adjL,1,2);

        displayEdges(adjL, v);

    }
}
