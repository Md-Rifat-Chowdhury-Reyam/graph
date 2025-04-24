package DFS.ForGraph;

import java.util.ArrayList;

public class GivenSourceUndGraph  {
    public static void main(String[] args) {

    }

}

class recursiveDFS
{
    //methods: 1.recursive 2.add edges 3.print dfs

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


}
