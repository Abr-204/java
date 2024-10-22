import java.util.Scanner;

public class bit_manipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        int n = 5;
        int pos = 2;
        int ans;
        //getbit
//        if(((1<<pos) & n) ==0) System.out.println("zero bit");
//        else System.out.println("one bit");

        //setbit
//        int ans=((1<<pos) | n);
//        System.out.println(ans);

        //clearbit
//        int ans=(~(1<<pos) & n);
//        System.out.println(ans);

        //update bit
        if (res == 1)
            ans = ((1 << pos) | n);
        else
            ans = (~(1 << pos) & n);
        System.out.println(ans);
    }
}
