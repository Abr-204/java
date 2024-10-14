import java.util.Scanner;

public class conditional_statements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
//        if(num%2==0)
//            System.out.println("Even");
//        else System.out.println("Odd");
        switch (num%2){
            case 0:
                    System.out.println("Even");
                    break;
            case 1:
                    System.out.println("Odd");
                    break;
            default:
                System.out.println("Can't be determined");
        }
    }
}
