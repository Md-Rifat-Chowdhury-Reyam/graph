package DFS.PostOrder;

public class PostOrDFS {
    public static void main(String[] args) {

        dfsPrint tree = new dfsPrint();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        tree.Print(tree.root);
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
        right = left= null;
    }
}

class dfsPrint
{
    Node root;

   public void Print(Node node)
   {
        if(node == null)
        {
            return;
        }

        else
        {
            Print(node.left);
            Print(node.right);
            System.out.print(node.data + " ");
        }
   }
}
