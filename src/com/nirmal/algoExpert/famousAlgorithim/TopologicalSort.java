package com.nirmal.algoExpert.famousAlgorithim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopologicalSort {
    public static List<Integer> topologicalSort(List<Integer> jobs, List<Integer[]> deps) {
        // Write your code here.

        JobGraph graph = createJobGraph(jobs, deps);
        return orderedJob(graph);
    }

    public static JobGraph createJobGraph(List<Integer> jobs, List<Integer[]> deps) {
        JobGraph jobGraph = new JobGraph(jobs);
        for (Integer[] dep : deps) {
            jobGraph.addPreReqs(dep[1], dep[0]);
        }
        return jobGraph;
    }

    public static List<Integer> orderedJob(JobGraph graph) {
        List<Integer> orderedJobs = new ArrayList<>();
        List<JobNode> nodes = new ArrayList<>(graph.nodes);
        while (nodes.size() > 1) {
            JobNode node = nodes.get(nodes.size()-1);
            nodes.remove(nodes.size() - 1);
            boolean isCyclic = depthFirstTraversal(node, orderedJobs);
            if (isCyclic) {
                return new ArrayList<Integer>();
            }
        }
        return orderedJobs;
    }

    public static boolean depthFirstTraversal(JobNode node, List<Integer> orderedJobs) {
        if (node.visited) {
            return false;
        }
        if (node.visiting) {
            return true;
        }

        node.visiting = true;

        for (JobNode preReq : node.prereqs) {
            boolean isCyclic = depthFirstTraversal(preReq, orderedJobs);
            if (isCyclic) {
                return true;
            }
        }
        node.visited = true;
        node.visiting = false;
        orderedJobs.add(node.job);
        return false;
    }



    public static class JobGraph {
        List<JobNode> nodes;
        Map<Integer, JobNode> graph;

        JobGraph(List<Integer> jobs) {
            nodes = new ArrayList<JobNode>();
            graph = new HashMap<Integer,JobNode>();
            for (Integer job : jobs) {
                addNode(job);
            }
        }

        void addNode(Integer job) {
            graph.put(job, new JobNode(job));
            nodes.add(graph.get(job));
        }

        public JobNode getNode(Integer job) {
            if (!graph.containsKey(job)) {
                addNode(job);
            }
            return graph.get(job);
        }

        void addPreReqs(Integer job, Integer preReq) {
            JobNode jobNode = getNode(job);
            JobNode preReqNode = getNode(preReq);
            jobNode.prereqs.add(preReqNode);
        }
    }

    public static class JobNode {
        Integer job;
        List<JobNode> prereqs;
        boolean visiting;
        boolean visited;

        JobNode(Integer job) {
            this.job = job;
            this.prereqs = new ArrayList<JobNode>();
            visited = false;
            visiting = false;
        }
    }
}
