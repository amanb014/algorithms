package com.company.aman.java;

import java.util.HashMap;

public class Node {
    private String id;
    private String data;
    private int hId;
    //Stores the adjacent nodes and also whether this node can traverse or not.
    private HashMap<Node, Boolean> connections;

    public Node(String id, String data) {
        connections = new HashMap<Node, Boolean>();
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void addTraversal(Node n, Boolean canTraverse) {
        if(connections.get(n) == null) {
            connections.put(n, canTraverse);
        }
    }

    public int gethId() {
        return hId;
    }

    public void sethId(int hId) {
        this.hId = hId;
    }

    public String getString() {
        return "Node: " + id + ", connections: " + connections;
    }
}