import java.util.*;
public class arrays
{
    public static void printArray(int arr[],int n,Scanner sc,int element){
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                System.out.println("index:"+i);
            }
        }
    }
    public static void main(String[] args){
        int n=4;
        int element=14;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];

        printArray(arr,n,sc,element);

    }
}

