package Adjacency.List;

public class AddRmAdjList {


    //Adjacency List Representation
    int v;
    AddRmAdjLstNode [] graphArray;

    // constructor method
    public AddRmAdjList(int vertex)
    {
        this.v = vertex;
        graphArray = new AddRmAdjLstNode[v];

        for(int i = 0; i < v; i++)
        {
            graphArray[i] = null;
        }
    }

    //function to add edges from source to destination vertex;
    public void  addEdges(int sourceVertex, int destinationVertex)
    {
        AddRmAdjLstNode node = new AddRmAdjLstNode(destinationVertex);
        node.next = graphArray[sourceVertex];
        graphArray[sourceVertex] = node;
    }

    // function to add vertex;
    public void addVertex(int common, int source, int destination)
    {
        addEdges(source, common);
        addEdges(common, destination);
    }
    //print graph;

    public void printGraph()
    {
        for(int i = 0; i < v; i++)
        {
            System.out.print(i + " : ");
            AddRmAdjLstNode temp = graphArray[i];

            while (temp != null)
            {
                System.out.print( " -> " + temp.Vertex + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v = 4;
        AddRmAdjList graph = new AddRmAdjList(v);
        graph.addEdges(0,1);
        graph.addEdges(0,2);
        graph.addEdges(0,3);
        graph.addEdges(1,2);
        graph.addEdges(2,3);

        graph.printGraph();
    }

}
