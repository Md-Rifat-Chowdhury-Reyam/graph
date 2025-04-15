package Adjacency;

public class AddRmVerAdjMat {

    // number of vertices.
    private int n;

    // Adjacency Matrix
    private int[][] adjacencyMatrix = new int [10][10];

    //constructor
    public AddRmVerAdjMat(int x)
    {
        this.n = x;

        // each element of adjacency matrix initialling = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                adjacencyMatrix[i][j] = 0;
            }
        }

    }

    // Display the matrix
    public void  displayMatrix()
    {
        System.out.println(" \n\n The adjacency matrix");

        for(int i = 0 ; i < n; i++)
        {
            System.out.println(" ");

            for (int j = 0; j < n; j++)
            {
                System.out.print(" " + adjacencyMatrix[i][j] + " " );
            }
        }
    }
    public  void addedges(int x , int y)
    {
        if ((x >= n) || (y > n))
        {
            System.out.println("Vertex doesn't exits");
        }
        else if (x == y)
        {
            System.out.println("vertices are same value");
        }

        else
        { //connecting the vertex
            adjacencyMatrix[x][y] = 1;
            adjacencyMatrix[y][x] = 1;
        }
    }

    public  void  addVertex()
    {
        //increase vertex or node
        n++;

        for( int i = 0; i < n ; i++)
        {
            adjacencyMatrix[n-1][i] = 0;
            adjacencyMatrix[i][n-1] = 0;
        }
    }



    public static void main(String[] args)
    {
        AddRmVerAdjMat addG = new AddRmVerAdjMat(4);

        addG.addedges(0,1);
        addG.addedges(0,2);
        addG.addedges(1,2);
        addG.addedges(2,3);

        addG.displayMatrix();

        addG.addVertex();
        addG.addedges(4,3);

        addG.displayMatrix();

    }



}
