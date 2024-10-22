// abstract class Religion{
//     abstract void worship();
//     public void unite(){
//         System.out.println("Several religions unite");
//     }
//     Religion(){
//         System.out.println("Constructor called");
//     }
// }
interface Religion1{
    int count=500;
    void worship();
}
interface Religion2{

}
class Hindu implements Religion1,Religion2{
    Hindu(){
        System.out.println("Hindus called");
    }
    public void worship(){
        System.out.println("Hindus worship");
    }
}
public class Abstraction
{
    public static void main(String[] args) {
// 		Religion r=new Religion();
// 		r.worship();
        Hindu h=new Hindu();
        // h.unite();
    }
}
