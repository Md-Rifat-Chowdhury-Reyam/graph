package DFS.InOrder;

public class InOrder {
    public static void main(String[] args) {

        dfsTree tr = new dfsTree();
        tr.root = new Node(1);
        tr.root.left = new Node(2);
        tr.root.right = new Node(3);
        tr.root.left.left = new Node(4);
        tr.root.left.right = new Node(5);
        tr.root.right.right = new Node(6);


        tr.pritnDFS(tr.root);
    }
}

class Node
{
    int data;
    Node right;
    Node left;

    Node(int v)
    {
        this.data = v;
        right = left = null;

    }
}

class dfsTree
{
    Node root;
    public void pritnDFS(Node node)
    {
        if(node == null)
        {
            return;
        }

        else
        {
            pritnDFS(node.left);
            System.out.print(node.data + " ");
            pritnDFS(node.right);
        }
    }
}
