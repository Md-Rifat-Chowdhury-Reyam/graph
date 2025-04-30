package BFS.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsQueue
{
    public static void main(String[] args)
    {
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

        ArrayList<ArrayList<Integer>> res = bfs.levelOrder(root);

        for(ArrayList<Integer> level : res)
        {
            System.out.print("(");

            for (int i = 0; i < level.size(); i++)
            {
                System.out.print(level.get(i) + "");
                if(i <level.size() -1)
                {
                    System.out.print(",");
                }
            }
            System.out.print(") ");
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
    public static ArrayList<ArrayList<Integer>> levelOrder(Node root)
    {
        if(root == null)
        {
            return new  ArrayList<>();
        }

        Queue<Node> q = new LinkedList<>();

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        q.offer(root); // enqueue;
        int currentLevel = 0;


        while (!q.isEmpty())
        {
            int leng = q.size();
            res.add(new ArrayList<>());

            for (int i = 0; i < leng; i++)
            {
                Node node = q.poll();
                res.get(currentLevel).add(node.data);

                if(node.left != null)
                {
                    q.offer(node.left);

                }
                if(node.right != null)
                {
                    q.offer(node.right);
                }

            }
            currentLevel++;
        }


        return res;
    }
}