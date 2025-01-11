import java.util.*;
public class Graph {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));
        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));
        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));


    }
    public static void bfs(ArrayList<Edge> graph[],int V){
        boolean visited[]=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!visited[curr]){
                System.out.println(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    System.out.println(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean visited[]) {
        if (visited[curr]) {
            return;
        }
        System.out.println(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            dfs(graph, e.dest, visited);
        }
    }
    public static void allPaths(ArrayList<Edge> graph[],int src,int target,String path,boolean visited[]){
        if (src == target) {
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!visited[e.dest]){
                visited[e.dest]=true;
                allPaths(graph,e.dest,target,path+"->"+e.dest,visited);
                visited[e.dest]=false;
            }
        }
    }
    public static boolean DirectedCycle(ArrayList<Edge> graph[],boolean visited[],int curr,boolean rec[]){
        visited[curr]=true;
        rec[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }
            else if(!visited[e.dest]){
                if(DirectedCycle(graph,visited,e.dest,rec)){
                    return true;
                }
            }
        }
        rec[curr]=false;
        return false;
    }
    public static boolean UndirectedCycle(ArrayList<Edge> graph[],boolean visited[],int curr,int parent){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(visited[e.dest] && e.dest!=parent){
                return true;
            }
            if(!visited[e.dest]){
                if(UndirectedCycle(graph,visited,curr,e.dest)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        create(graph);
//        for(int i=0;i<graph[1].size();i++){
//            Edge e=graph[1].get(i);
//            System.out.println(e.dest+","+e.dest);
//        }
        bfs(graph,V);
        dfs(graph,0,new boolean[V]);
        int src=0;
        int target=3;
        allPaths(graph,src,target,String.valueOf(src),new boolean[V]);
        boolean visited[]=new boolean[V];
        boolean rec[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]) {
                System.out.println(DirectedCycle(graph, visited, 0, rec));
            }
        }
        System.out.println(UndirectedCycle(graph,new boolean[V],0,-1));
    }
}
