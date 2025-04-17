package transpose;

import java.util.Arrays;

public class squre {

    public static void transpose(int[][] mat)

    {
        int n = mat.length;

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    public static void prinM(int[][] mat)
    {
        transpose(mat);
        for (int[] row : mat)
        {
            System.out.println(Arrays.toString(row));
        }
    }


    public static void main(String[] args) {
        int [][] mat ={{ 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 }};
        prinM(mat);


    }
}
