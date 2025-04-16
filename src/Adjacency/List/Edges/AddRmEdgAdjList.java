package Adjacency.List.Edges;

import java.util.Vector;

public class AddRmEdgAdjList {

    static void addEdges(Vector<Integer>[] adjList, int x, int y)
    {
        adjList[x].add(y);
        adjList[y].add(x);
    }

    static  void delEdges(Vector<Integer>[] adjList, int x, int y)
    {
        for(int i = 0; i < adjList[x].size(); i++)
        {
            if(adjList[x].get(i) == y)
            {
                adjList[x].remove(i);
                        break;
            }
        }

        for(int i = 0 ; i < adjList[y].size(); i++ )
        {
            if(adjList[y].get(i) == x)
            {
                adjList[y].remove(i);
                break;
            }
        }

    }

    static void displayEdges(Vector<Integer>[] adjList, int v)
    {
        for (int i = 0; i < v; i++)
        {
            System.out.print("Vertex" + i);
            for(Integer x : adjList[i])
            {
                System.out.print("->" + x);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int v = 6;
        Vector<Integer>[] adjL = new Vector[v];
        for(int i = 0; i < v; i++)
        {
            adjL[i] = new Vector<Integer>();
        }

        addEdges(adjL,0,1);
        addEdges(adjL,0,2);
        addEdges(adjL,1,2);

        addEdges(adjL,1,3);
        addEdges(adjL,2,3);
        addEdges(adjL,3,4);

        displayEdges(adjL, v);

    }
}
