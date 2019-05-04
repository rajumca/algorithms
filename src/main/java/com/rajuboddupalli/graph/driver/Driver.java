package com.rajuboddupalli.graph.driver;

import com.rajuboddupalli.graph.algorithms.BFS;
import com.rajuboddupalli.graph.algorithms.DFS;
import com.rajuboddupalli.graph.data.Graph;

public class Driver {

    public static void main(String[] args) {
        connectedGraph();
        disconnectedGraph();
    }

    private static void disconnectedGraph() {
        System.out.println("Disconnected Graph***********");
        Graph g = new Graph(5);
        addDisconnectedEdges(g);
        BFS bfs = new BFS();
        for(int i=0;i<g.getSize();i++) {
            if(!g.isVisited(i)) {
                bfs.bfs(g, i);
            }
        }
        bfs.printCounter();


        Graph g2 = new Graph(5);
        addDisconnectedEdges(g2);
        DFS dfs = new DFS();
        for(int i=0;i<g2.getSize();i++) {
            if(!g2.isVisited(i)) {
                dfs.dfs(g2, i);
            }
        }
        dfs.printCounter();
        System.out.println();
    }

    private static void addDisconnectedEdges(Graph g) {
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(4, 3);
        g.addEdge(3, 4);
    }

    private static void connectedGraph() {
        System.out.println("Connected Graph***********");
        Graph graph=new Graph(5);
        addEdges(graph);
        BFS bfs = new BFS();
        bfs.bfs(graph,4);
        bfs.printCounter();
        Graph graph2=new Graph(5);
        addEdges(graph2);
        DFS dfs = new DFS();
        dfs.dfs(graph2, 0);
        dfs.printCounter();
        System.out.println();
    }

    private static void addEdges(Graph graph) {
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        graph.addEdge(0,4);
        graph.addEdge(4, 0);
    }
}
