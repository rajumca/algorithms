package com.rajuboddupalli.graph.algorithms;

import com.rajuboddupalli.graph.data.Graph;

import java.util.LinkedList;

public class BFS {
    int counter;
    public BFS(){
        System.out.print("BFS:");
    }
    public  void bfs(Graph graph, int s) {
        LinkedList<Integer> queue=new LinkedList<Integer>();

        graph.setVisited(s);
        queue.add(s);

        while (!queue.isEmpty()){
            Integer e=queue.poll();
            System.out.print(e+"->");
            for(Integer index:graph.getVertices()[e]) {
                counter++;
                if (!graph.isVisited(index)) {
                    queue.add(index);
                    graph.setVisited(index);

                }
            }
        }

    }

    public void printCounter(){
        System.out.println("counter: "+counter);
    }
}
