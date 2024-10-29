public class QueueUsingArray {
    static int arr[];
    static int size;
    static int rear=-1;
    QueueUsingArray(int n){
        this.size=n;
        arr=new int[size];

    }
    public static boolean isEmpty(){
        return rear==-1;
    }
    public static boolean isFull(){
        return rear==size-1;
    }
    public static void add(int data){
        if(isFull()){
            return ;
        }
        rear++;
        arr[rear]=data;
    }
    public static int remove(){
        if(isEmpty()){
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        QueueUsingArray q=new QueueUsingArray(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            System.out.println(q.remove());
        }
    }
}
