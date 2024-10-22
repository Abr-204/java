public class countPaths
{
    public static int countPaths(int i,int j,int n,int m){
        if(i==n || j==m) return 0;
        if(i==n-1 || j==m-1) return 1;
        int down=countPaths(i,j+1,n,m);
        int right=countPaths(i+1,j,n,m);
        return down+right;
    }
    public static void main(String[] args) {
        int i=0,j=0,n=3,m=3;
        System.out.println(countPaths(i,j,n,m));
    }
}
