package com.company.aman.java;

public class Main {

    public static void main(String[] args) {
        int[][] matrix =    {{0,1,0,1,1,0,0},
                             {1,0,1,0,0,1,0},
                             {0,1,0,0,0,1,0},
                             {1,0,0,0,0,1,1},
                             {1,0,0,0,0,0,1},
                             {0,1,1,1,0,0,1},
                             {0,0,0,1,1,1,0}};


        Graph g = new Graph();
        g.makeFromAdjMatrix(matrix);
        System.out.println(g.printMe());




    }
}
