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
                System.out.println(" " + grapM[i][j]);
            }
        }
    }
}
