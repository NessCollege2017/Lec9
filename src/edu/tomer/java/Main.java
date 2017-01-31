package edu.tomer.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] arr = IO.getIntArraydbl();
        IO.print(arr);
        IO.printLineSep();

        int[] firstDiagonal = Matrices.firstDiagonal(arr);
        IO.print(firstDiagonal);

        IO.printLineSep();
        int[] secondDiagonal = Matrices.secondDiagonal(arr);
        IO.print(secondDiagonal);

    }


}
