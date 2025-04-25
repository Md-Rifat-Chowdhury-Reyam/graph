package DFS.ForGraph;

import java.util.ArrayList;

public class GivenSourceUndGraph extends recursiveDFS {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjM = new ArrayList<>();

        int v = 5;

        for (int i = 0; i < v; i++) //initialize adjacent list
        {
            adjM.add(new ArrayList<>());
        }

        //edges add
        int[][] edges = { { 1, 2 },{ 1, 0 },{ 2, 0 },{ 2, 3 },{ 2, 4 } };
        for(int[] i : edges)
        {
            addEdges(adjM, i[0], i[1]);
        }

        ArrayList<Integer> res = RecDFS(adjM);

        for(int i : res)
        {
            System.out.print(res.get(i));
        }

    }

}

class recursiveDFS
{
    //methods: 1.recursive 2.add edges 3.Initialize visited array

    public static void recursive(ArrayList<ArrayList<Integer>> adjMAt , boolean[] visited, int sourceNode, ArrayList<Integer> res )
    {
        visited[sourceNode] = true;
        res.add(sourceNode);

               // while iteration uses loops to repeat a block of code.
          //Recursion involves a function calling itself to solve a problem,
        for(int i : adjMAt.get(sourceNode))
        {
            if(!visited[i])
            {
                recursive(adjMAt, visited, i, res);
            }
        }

    }

    public static void addEdges(ArrayList<ArrayList<Integer>> adjM, int x, int y)
    {
        adjM.get(x).add(y);
        adjM.get(y).add(x);
    }

    //initialize the visited array and again call recursive method
    public static ArrayList<Integer> RecDFS(ArrayList<ArrayList<Integer>> adjM)
    {
        boolean[] visited = new boolean[adjM.size()]; // visited boolean array initialize;
        ArrayList<Integer> res = new ArrayList<>(); // restore stack list initialize;

        recursive(adjM, visited, 0,res);
        return res;
    }

}
