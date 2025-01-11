import java.util.*;
public class Dijkstras {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static  void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }
            graph[0].add(new Edge(0,1,2));
            graph[0].add(new Edge(0,2,4));
            graph[0].add(new Edge(0,3,7));
            graph[1].add(new Edge(1,2,1));
            graph[2].add(new Edge(2,4,3));
            graph[3].add(new Edge(3,4,2));
            graph[3].add(new Edge(3,5,1));
            graph[4].add(new Edge(4,5,5));
        }
        static class Pair implements Comparable<Pair>{
        int node;
        int path;
        public Pair(int n,int p){
            this.node=n;
            this.path=p;
        }
        @Override
            public int compareTo(Pair p2){
            return this.path-p2.path;
        }
    }
    public static int[] Dijskstra(ArrayList<Edge> graph[],int src){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int dst[]=new int[graph.length];
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<dst.length;i++){
            if(i!=src){
                dst[i]= Integer.MAX_VALUE;
            }
        }
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!visited[curr.node]) {
                visited[curr.node] = true;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if (!visited[v] && dst[u] + e.wt < dst[v]) {
                        dst[v] = dst[u] + e.wt;
                        pq.add(new Pair(v, dst[v]));
                    }
                }
            }
        }
            return dst;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        int src = 0;
        int dst[] = Dijskstra(graph, src);
        for (int i = 0; i < dst.length; i++) {
            System.out.println(dst[i] + " ");
        }
    }
}

