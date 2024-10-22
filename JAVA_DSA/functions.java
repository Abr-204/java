//import java.util.*;
//
//public class functions {
//    public static void printName(String name){
//        System.out.print(name);
//        return;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
//        printName(name);
//    }
//}

//import java.util.*;
//public class functions
//{
//    public static int add(int a,int b){
//        int sum=a+b;
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.print(add(a,b));
//    }
//}

import java.util.*;
public class functions
{
    public static void factorial(int n){
        // if(n==0||n==1) return 1;
        // return n*factorial(n-1);
        int ans=1;
        for(int i=n;i>=1;i--){
            ans=ans*i;
        }
        System.out.print(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);
    }
}
