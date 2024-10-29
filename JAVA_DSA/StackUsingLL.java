public class StackUsingLL{
    private static class Nodes{
        int data;
        Nodes next;
        Nodes(int d){
            this.data=d;
            this.next=null;
        }
    }
    static class Stack {
        public static Nodes head = null;

        public void push(int d) {
            Nodes newNode = new Nodes(d);
            if (head == null) {
                head = newNode;
            }
            newNode.next = head;
            head = newNode;
        }

        public static boolean isEmpty() {
            return head == null;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
//        public void pushAtBottom(int d,Stack <Integer> s){
//            if(s.isEmpty()){
//                s.push(d);
//                return;
//            }
//            int top=s.pop();
//            pushAtBottom(d,s);
//            s.push(top);
//        }
//        public void reverse(int d,Stack<Integer> s) {
//            if(s.isEmpty()){
//                return;
//            }
//            int top = s.pop();
//            reverse(d, s);
//            s.pushAtBottom(top,s);
//        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
//        s.pushAtBottom(5,s);
//        s.reverse();
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
