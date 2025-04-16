package Adjacency.List.Node;

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
            System.out.println(" ");
        }
    }
    //delete vertex;
    public void deleteVertex(int nodeKey)
    {
        for(int i = 0; i < v; i++)
        {
            AddRmAdjLstNode curr =  graphArray[i], prev = null;

            if(i == nodeKey)
            {
                graphArray[i] = null;
            }

            else {

                while(curr != null)
                {
                    if(curr.Vertex == nodeKey)
                    {
                        if(prev == null)
                        {
                            graphArray[i] = curr.next;
                        }
                        else
                        {
                            prev.next = curr.next;
                        }
                        break;

                    }
                    prev = curr;
                    curr = curr.next;
                }
            }

        }
    }

    public static void main(String[] args) {
        int v = 6;
        AddRmAdjList graph = new AddRmAdjList(v);
        graph.addEdges(0,1);
        graph.addEdges(0,2);
        graph.addEdges(0,3);
        graph.addEdges(1,2);
        graph.addEdges(2,3);

        graph.printGraph();
        System.out.println("\n");

        graph.addVertex(5,3,2);
        graph.printGraph();
        System.out.println("\n");

        graph.deleteVertex(5);
        graph.printGraph();



    }

}
