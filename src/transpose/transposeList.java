package transpose;

import java.util.ArrayList;

public class transposeList {

    private static int vertices = 5;
    private static ArrayList<Integer>[] adjMat = new ArrayList[vertices];
    private static ArrayList<Integer>[] transMat = new ArrayList[vertices];


    //add edges
    public static void addedge(int x, int y, boolean choice)
    {

        if(!choice)
        {
            adjMat[x].add(y);
        }
        else
        {
            transMat[x].add(y);
        }
    }

    //print graph
    public static void printGraph()
    {
        for (int i = 0; i < vertices; i++)
        {
            System.out.print(i + " --> ");

            for(int j = 0; j < transMat[i].size(); j++)
            {
                System.out.print(transMat[i].get(j) + ",");
            }
            System.out.println();
        }
    }

    //get transpose Matrix
    public static void getTranspose()
    {
        for (int i = 0; i < vertices; i++)
        {
            for(int j = 0; j < adjMat[i].size(); j++)
            {
                addedge(adjMat[i].get(j), i , true);
            }
        }

    }


    public static void main(String[] args) throws java.lang.Exception {

        for(int i = 0; i <vertices; i++)
        {
            adjMat[i] = new ArrayList<>();
            transMat[i] = new ArrayList<>();
        }
        addedge(0, 1, false);
        addedge(0, 4, false);
        addedge(0, 3, false);
        addedge(2, 0, false);
        addedge(3, 2, false);
        addedge(4, 1, false);
        addedge(4, 3, false);

        getTranspose();
        printGraph();
    }
}
