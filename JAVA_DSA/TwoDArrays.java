import java.util.*;
public class TwoDArrays
{
    public static void printArray(int arr[][],int m,int n,Scanner sc,int element){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==element){
                    System.out.println("index: "+"("+i+","+j+")");
                }
            }
        }
    }
    public static void main(String[] args){
        int m=4,n=3;
        int element=9;
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][3];
        printArray(arr,m,n,sc,element);
    }
}

