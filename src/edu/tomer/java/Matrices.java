package edu.tomer.java;

/**
 * Created by Android2017 on 31/01/2017.
 */
public class Matrices {


    public static int[] firstDiagonal(int[][] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i][i];
        }
        return result;
    }

    public static int[] secondDiagonal(int[][] arr){
        int[] result = new int[arr.length];
        for (int row = 0, col = arr.length - 1; row < arr.length; row++, col--) {
            result[row] = arr[row][col];
        }
        return result;
    }
}
