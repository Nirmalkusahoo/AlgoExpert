package com.nirmal.general;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public void breadthFirstSearch(int s){
        boolean[] visited=new boolean[V];
        Queue<Integer> q= new LinkedList<>();
        q.offer(s);
        visited[s]=true;
        while(!q.isEmpty()){
            int value=q.poll();
            System.out.print(value+ "  ");
            for(int adjacentNode:list[value]){
                if(!visited[adjacentNode]){
                    q.offer(adjacentNode);
                    visited[adjacentNode]= true;
                }
            }
        }

    }

    public void depthFirstSearch(int s){
        boolean[] visited=new boolean[V];
        Stack<Integer> stack= new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()){
            int u=stack.pop();
            if(!visited[u]){
                visited[u]= true;
                System.out.print(u+" ");
                for(int v:list[u]){
                    if(!visited[v]){
                        stack.push(v);
                    }
                }
            }
        }

    }

    public void depthFirstSearchRecursive() {
        boolean[] visited=new boolean[V];
        for(int v=0;v<V;v++){
            if(!visited[v]){
                dfs(v,visited);
            }
        }
    }

    public void dfs(int v,boolean[] visited){
        visited[v]=true;
        System.out.print(v+" ");
        for(int w:list[v]){
            if(!visited[w]){
                dfs(w,visited);
            }
        }
    }
    public static void main(String[] args) {
        Graph graph=new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        graph.addEdge(2,4);
        System.out.println(graph);
        graph.breadthFirstSearch(0);
        graph.depthFirstSearch(0);
        System.out.println("\n");
        graph.depthFirstSearchRecursive();
    }
}
