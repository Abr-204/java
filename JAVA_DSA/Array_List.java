import java.util.ArrayList;
import java.util.Collections;
class Array_List {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(5);
        list.add(1,3);
        list.set(0,8);
        int element=list.get(1);
        list.remove(1);
        int size=list.size();
        for(int i=0;i<size;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list);
        System.out.println(element);
        System.out.println(size);
        Collections.sort(list);
        System.out.println(list);

    }
}
