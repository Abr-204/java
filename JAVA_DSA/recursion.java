//public class recursion
//{
//    public static void sum(int i,int n,int s){
//        if(i==n){
//            s+=i;
//            System.out.println(s);
//            return;
//        }
//        s+=i;
//        sum(i+1,n,s);
//        System.out.println(i);
//    }
//    public static void main(String[] args) {
//        int s=0;
//        sum(1,5,s);
//    }
//}

public class recursion
{
    public static void fib(int a,int b,int n){
        if(n==0) return;
        int c=a+b;
        System.out.println(c);
        fib(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1,n=8;
        System.out.println(a);
        System.out.println(b);
        fib(a,b,n-2);
    }
}
