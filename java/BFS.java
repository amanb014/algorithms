package com.company.aman.java;

import java.util.LinkedList;

public class BFS extends GraphAlgorithms {

    private LinkedList<Node> visited;
    private LinkedList<Node> queue;
    private Graph graph;

    public BFS(Graph g) {
        this.graph = g;
    }

    public void traverseBFS(Node start) {
        visited = new LinkedList<Node>();
        queue = new LinkedList<Node>();

        Node checking;

        queue.add(start);
        visited.add(start);

        while(queue.size() != 0) {
            checking = queue.poll();
            LinkedList<Node> neighbors = checking.getConnections();

            System.out.println("Checking Node: " + checking.getData());
            for(Node n : neighbors) {
                if(!visited.contains(n)) {
                    visited.add(n);
                    queue.add(n);
                }
            }

        }

    }


    public void findNode(Node start, Node end) {

    }


}
