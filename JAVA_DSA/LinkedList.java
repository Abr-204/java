class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
class LL {
    Node head;
    public void insert(int d)
    {
        Node newNode=new Node(d);
        if(head==null) {
            head = newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
    public Node mid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(Node head) {
        if(head==null || head.next==null) return true;
        Node middle=mid(head);
        Node firststart=head;
        Node secondstart=reverse(middle);
        while(secondstart!=null){
            if(firststart.data!=secondstart.data){
                return false;
            }
            firststart=firststart.next;
            secondstart=secondstart.next;
        }
        return true;
    }
    public Node reverse(Node head) {
        //iterative
//        Node prev = null;
//        Node current = head;
//        Node next = null;
//
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        head = prev;
//    }
        //recursive
        if(head==null||head.next==null){
            return head;
        }
        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        LL list=new LL();
        list.insert(1);
        list.insert(2);
        list.insert(1);
        list.insert(2);
        list.insert(1);
        list.print();
        list.head=list.reverse(list.head);
        list.print();
        boolean isPalindrome = list.isPalindrome(list.head);
        System.out.println(isPalindrome);

    }
}
