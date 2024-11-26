import java.util.HashSet;
import java.util.Iterator;
public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(1);
        s.remove(2);
        System.out.println(s);
        System.out.println(s.contains(2));
        Iterator it=s.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
