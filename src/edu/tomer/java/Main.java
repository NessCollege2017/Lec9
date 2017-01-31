package edu.tomer.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] arr = IO.getIntArraydbl();
        IO.printPretty(arr);
    }






    public static void firstQuestion(){
        int[][] arr = IO.getIntArraydbl();
        IO.print(arr);
        IO.printLineSep(15);

        int[] firstDiagonal = Matrices.firstDiagonal(arr);
        IO.print(firstDiagonal);

        IO.printLineSep(15);
        int[] secondDiagonal = Matrices.secondDiagonal(arr);
        IO.print(secondDiagonal);
    }
}
