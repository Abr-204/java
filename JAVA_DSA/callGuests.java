public class callGuests
{
    public static int guests(int n){
        if(n<=1) return 1;
        int single=guests(n-1);
        int pairs=(n-1)*guests(n-2);
        return single+pairs;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(guests(n));
    }
}
