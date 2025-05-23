package Adjacency.Matrix;

public class AddRmEdgAdjMat {
    //number of vertex
    private int n;

    //adjacent matrix
    private int[][] grapM = new int [10][10];

    AddRmEdgAdjMat(int x)
    {
        this.n = x;

        //initialize each element of adjacent matrix to zero
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                grapM[i][j] = 0;
            }
        }
    }
    public void displayMatrix()
    {
        for(int i = 0; i < n; i++)
        {
            System.out.println();
            for(int j = 0; j < n; j++)
            {
                System.out.print(" " + grapM[i][j]);
            }
        }
        System.out.println();
    }

    public void addEdges(int x, int y)
    {
        //check vertex
        if(x < 0 || x >= n)
        {
            System.out.println("vertex "+ x +" doesn't exist");
        }
        if(y < 0 || y >= n)
        {
            System.out.println("vertex " + y + " doesn't exist");
        }
        if(x == y ) {
            System.out.println("same vertex" + x + " " + y);
        }
        else
        {
            //Insert edges;
            grapM[x][y] = 1;
            grapM[y][x] = 1;

        }

    }

    //remove the Edges
    public void removeEdges(int x, int y)
    {
        if(x < 0 || x >=n)
        {
            System.out.println("Vertex doesn't exit");
        }
        if(y < 0 || y >= n)
        {
            System.out.println("vertex doesn't exit");
        }
        if(x == y)
        {
            System.out.println("Both vertex are same");
        }

        else
        {
            grapM[x][y] = 0;
            grapM[y][x] = 0;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int v =4;
        AddRmEdgAdjMat adM = new AddRmEdgAdjMat(v);

        adM.addEdges(0,1);
        adM.addEdges(1,2);
        adM.addEdges(0,2);
        adM.addEdges(2,3);
        adM.displayMatrix();

        adM.removeEdges(0,1);
        adM.displayMatrix();
    }
}
