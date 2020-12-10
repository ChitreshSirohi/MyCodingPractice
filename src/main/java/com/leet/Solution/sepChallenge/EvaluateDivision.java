package com.leet.Solution.sepChallenge;

import java.util.*;

public class EvaluateDivision {
    public double[] calcEquation(final List<List<String>> equations, final double[] values, final List<List<String>> queries) {
        final double[] results = new double[queries.size()];
        final Map<String, List<Vertex>> graph = buildGraph(equations, values);
        for(int i=0;i< queries.size();i++){
            results[i] = dfs(queries.get(i).get(0), queries.get(i).get(1), new HashSet<>(), graph);
        }
        return results;
    }

    public double dfs(final String src, final String dest, final Set<String> visited, final Map<String, List<Vertex>> graph){
        if(!graph.containsKey(src) || !graph.containsKey(dest)){
            return -1.0;
        }
        if(src.equals(dest)){
            return 1.0;
        }
        if(visited.contains(src)){
            return 1.0;
        }
        visited.add(src);
        for (final Vertex vertex:graph.get(src)) {
            if(!visited.contains(vertex.key)){
                final double ans = dfs(vertex.key, dest, visited, graph);
                if(ans != -1.0){
                    return ans * vertex.val;
                }
            }
        }
        return -1;
    }


    public Map<String, List<Vertex>> buildGraph(final List<List<String>> equations, final double[] values){
        final Map<String, List<Vertex>> graph = new HashMap<>();

        for (int i =0;i < equations.size();i++){
            graph.putIfAbsent(equations.get(i).get(0),new ArrayList<>());
            graph.putIfAbsent(equations.get(i).get(1),new ArrayList<>());
            graph.get(equations.get(i).get(0)).add(new Vertex(equations.get(i).get(1),values[i]));
            graph.get(equations.get(i).get(1)).add(new Vertex(equations.get(i).get(0),1/values[i]));
        }
        return graph;
    }

}

class Vertex{
    public String key;
    public double val;

    public Vertex(final String key, final double val) {
        this.key = key;
        this.val = val;
    }
}
