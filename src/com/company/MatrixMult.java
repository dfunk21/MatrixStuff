package com.company;

/**
 * Created by df377 on 12/21/16.
 */
public class MatrixMult {

    public static int[][] mult (int a[][], int b[][])
    {
        int product[][] = new int[a.length][b[0].length];
        int num = 0;
        int sum = 0;

        int x = 0;
        int y = 0;

        for (int row=0; row < a.length; row++)
        {
            for(int col=0; col<a[0].length; col++) {
                sum = sum + (a[row][num] * b[num][row]);
                num++;
                y++;
            }
            product[x][y] = sum;
            x++;
        }


        return product;
    }
}
