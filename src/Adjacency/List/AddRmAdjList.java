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

}
