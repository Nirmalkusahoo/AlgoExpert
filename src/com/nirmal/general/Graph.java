package com.nirmal.general;

import java.util.LinkedList;

public class Graph {
    public LinkedList<Integer>[] list;
    int V;
    int E;

    Graph(int nodes){
        this.list=new LinkedList[nodes];
        this.V=nodes;
        this.E=0;
        for(int i=0;i<nodes;i++){
            list[i]=new LinkedList<>();
        }
    }

    public void addEdge(int u,int v){
        list[u].add(v);
        list[v].add(u);
        E++;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(V+" Vertex "+ E+" Edges" +"\n");
        for(int i=0;i<V;i++){
            sb.append(i+": ");
            for(int data:list[i]){
                sb.append(data+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Graph graph=new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        System.out.println(graph);
    }
}
