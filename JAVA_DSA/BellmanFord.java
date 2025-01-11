import java.util.*;
public class BellmanFord {
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
    public static void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,2,-4));
        graph[2].add(new Edge(2,3,2));
        graph[3].add(new Edge(3,4,4));
        graph[4].add(new Edge(4,1,-10));
    }
    public static int[] bellmanFord(ArrayList<Edge> graph[],int src){
        int dst[]=new int[graph.length];
        for(int i=0;i<dst.length;i++){
            if(i!=src){
                dst[i]=Integer.MAX_VALUE;
            }
            for(int l=0;l<graph.length-1;l++){//o(V)
                for(int j=0;j<graph.length;j++){//o(E)
                    for(int k=0;k<graph[j].size();k++){
                        Edge e=graph[j].get(k);
                        int u=e.src;
                        int v=e.dest;
                        if(dst[u]!=Integer.MAX_VALUE && dst[u]+ e.wt<dst[v]){
                            dst[v]=dst[u]+e.wt;
                        }
                    }
                }
            }
            //Negative cycle
            for(int j=0; j<graph.length; j++) {
                for(int k=0; k<graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dst[u] != Integer.MAX_VALUE && dst[u]+wt < dst[v]) {
                        System.out.println("negative weight cycle exists");
                        break;
                    }
                }
            }
        }
        return dst;
    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        create(graph);
        int dst[]=bellmanFord(graph,0);
        for(int i=0;i<dst.length;i++){
            System.out.println(dst[i]+" ");
        }
    }
}
