public class CircularQueueUsingArray {
    static int arr[];
    static int size;
    static int rear=-1;
    static int front=-1;
    CircularQueueUsingArray(int n){
        this.size=n;
        arr=new int[size];
    }
    public static boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }
    public static void add(int data){
        if(isFull()){
            return ;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }
    public static int remove() {
        if (isEmpty()) {
            return -1;
        }
        int result = arr[front];
        if(rear==front){
            rear=front=-1;
        }
        else {
            front = (front + 1) % size;
        }
            return result;
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    public static void main(String[] args) {
        CircularQueueUsingArray q=new CircularQueueUsingArray(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());
        q.add(6);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            System.out.println(q.remove());
        }
    }
}

