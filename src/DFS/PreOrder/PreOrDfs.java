package DFS.PreOrder;

public class PreOrDfs {
    public static void main(String[] args)
    {
        dfsTreeTraverse tree = new dfsTreeTraverse();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        tree.printMethod(tree.root);

    }
}

class Node  // this class create Node and initialized variables or node's need;
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

class dfsTreeTraverse{ // this class create all gradients for make a tree with node class;
    Node root;

    public void printMethod(Node node)
    {
        if(node == null)
        {
            return;
        }
        else
        {
            System.out.print(node.data + " ");
        }

        //left subtree recursively traverse;
        printMethod(node.left);
        // finally traverse right;
        printMethod(node.right);

    }
}
