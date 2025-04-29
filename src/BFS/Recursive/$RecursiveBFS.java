package BFS.Recursive;

import java.util.ArrayList;

public class $RecursiveBFS {

    public static void main(String[] args) {

    }
}

class Node
{
     int data;
     Node right;
     Node left;

     Node(int value)
     {
         this.data = value;
         right = left = null;
     }
}

class LevelRecur
{
    public void RecursiveMethod(Node root, int level, ArrayList<ArrayList<Integer>> res)
    {
        if (root == null)
        {
            return;
        }

        if (res.size() <= level)
        {
            res.add(new ArrayList<>());
        }
    }

}

