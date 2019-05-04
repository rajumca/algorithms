package com.rajuboddupalli.graph.algorithms;

import com.rajuboddupalli.graph.data.Graph;

public class DFS {
    int counter;
    public  void dfs(Graph graph, int s) {
        counter++;
        if (graph.isVisited(s)) {
            return;
        }
        graph.setVisited(s);
        System.out.print(s + "->");
        for (Integer vertice : graph.getVertices()[s]) {
            dfs(graph, vertice);
        }
    }

    public void printCounter(){
        System.out.println("counter: "+counter);
    }
    public DFS(){
        System.out.print("DFS:");
    }
}
