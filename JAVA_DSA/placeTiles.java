//place tiles of 1*m in a floor of n*m size
public class placeTiles
{
    public static int placeTiles(int n,int m){
        if(n==m) return 2;
        if(n<m) return 1;
        int horizontal=placeTiles(n-1,m);
        int vertical=placeTiles(n-m,m);
        return horizontal+vertical;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(placeTiles(n,m));
    }
}
