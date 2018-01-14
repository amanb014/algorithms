package com.company.aman.java;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Graph {

    private HashMap<String, Node> nodes;

    public Graph() {
        nodes = new HashMap<String, Node>();
    }

    public Graph(int n) {
        nodes = new HashMap<String, Node>();
        for(int i = 0; i < n; i++) {
            addNode(createNode(String.valueOf(i)));
        }
    }

    public void addNode(Node a) {
        nodes.put(a.getId(), a);

    }

    public void makeConnection(String a, String b, Boolean twoWay) {
        nodes.get(a).addTraversal(nodes.get(b), true);
        nodes.get(b).addTraversal(nodes.get(a), twoWay);
    }

    public ArrayList<Node> getNodes() {
        ArrayList<Node> all = new ArrayList<Node>();
        for(String i : nodes.keySet()) {
            all.add(nodes.get(i));
        }
        return all;
    }

    public void makeFromAdjMatrix(int[][] matrix) {

        int s = matrix.length;
        Node[] nds = new Node[s];

        for(int[] arr : matrix) {
            if(arr.length != matrix[0].length) {
                System.out.println("All arrays must be of same length. Aborting.");
                return;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            nds[i] = createNode(String.valueOf(i));
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j] == 1) {
                    nds[i].addTraversal(nds[j], true);
                }
            }
        }

        for(Node n : nds) {
            addNode(n);
        }

    }

    private Node createNode(String data) {
        return new Node(UUID.randomUUID().toString(), data);
    }

    public String printMe() {
        String ret = "Nodes: " + nodes.size();
        for(String s : nodes.keySet()) {
            ret += "\n" + nodes.get(s).getString();
        }
        return ret;
    }

    public Node getRandomNode() {
        Object[] entries = nodes.values().toArray();
        Random rand = new Random();
        return (Node) entries[rand.nextInt(entries.length - 1)];
    }
}
