package BFS.Recursive;

import java.util.ArrayList;

public class $RecursiveBFS {

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(12);
        root.right = new Node(13);

        root.left.left = new Node(7);
        root.left.right = new Node(14);

        root.right.right = new Node(2);

        root.left.left.left = new Node(17);
        root.left.left.right = new Node(23);

        root.left.right.left = new Node(27);
        root.left.right.right = new Node(3);

        root.right.right.left = new Node(8);
        root.right.right.right = new Node(11);

        bfs b = new bfs();

        ArrayList<ArrayList<Integer>> res = b.levelOrderMethod(root);

        for(ArrayList<Integer> level : res)
        {
            System.out.print(" (");
            for(int i = 0; i < level.size(); i++)
            {
                System.out.print(level.get(i) );
                if(i < level.size() - 1)
                {
                    System.out.print(",");
                }
            }
            System.out.print(")");
        }



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

class bfs
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

        res.get(level).add(root.data);

        RecursiveMethod(root.left, level + 1, res);
        RecursiveMethod(root.right, level + 1, res);
    }

    ArrayList<ArrayList<Integer>>  levelOrderMethod(Node root)
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        RecursiveMethod(root, 0, res);

        return res;
    }

}

