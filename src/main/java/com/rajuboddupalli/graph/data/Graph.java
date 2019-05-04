package com.rajuboddupalli.graph.data;

import java.util.LinkedList;

public class Graph {

    LinkedList<Integer> vertices[];
    int v;
    boolean[] visited;

    public Graph(int v) {
       this.v=v;

       vertices = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            vertices[i] = new LinkedList<Integer>();
        }
       visited=new boolean[v];
    }

    public void addEdge(int source, int target){
        vertices[source].add(target);
        vertices[target].add(source);
    }
    public int getSize(){
       return v;
    }
    public LinkedList<Integer>[] getVertices(){
       return vertices;
    }

    public void setVisited(int e){
       visited[e]=true;
    }
    public boolean isVisited(int e){
       return visited[e];
    }
    public void clearHistory(){
        visited=new boolean[v];
    }
}
