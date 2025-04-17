package transpose;

import java.util.Arrays;

public class example {

    //function to store values of mat to res;
    public static void transpose(int[][] mat, int[][] res)
    {
        int row = mat.length;
        int col = mat[0].length;


        //transfer row and colum
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                res[j][i] = mat[i][j];
            }
        }
    }
    public static void printD(int [][] res)
    {
        for(int[] row : res)
        {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8}};

        int row = mat.length;
        int col =  mat[0].length;

        int[][] res = new int[col][row];

        transpose(mat, res);
        printD(res);


    }
}
