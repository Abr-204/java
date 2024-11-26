public class Hash_Map {
    static class HashMap<K,V>{
        public class Node{
            K key;
            V value;
            public Node<K key,V value>{
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=5;
            this.buckets=new LinkedList[8];
            for(int i=0;i<7;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashFxn(K key){
            int bi=key.hashCode();
            return Math.abs(bi)%N;
        }
        private int search(K key,int bi){
            LinkedList<Node> ll=new buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        public void rehash(){
            LinkedList<Node> oldBucket[]=buckets;
            buckets=new LinkedList[N*2];
            for(int i=0;i<N*2;i++){
                buckets[i]=new LinkedList<>();
            }
                for(int i=0;i<oldBucket.length;i++) {
                    LinkedList<Node> ll = oldBucket[i];
                    for (int j = 0; j < ll.size(); j++) {
                        Node node = ll.get(j);
                        put(node.key, node.value);
                    }
                }
        }
        public void put(K key,V value){
            int bi=hashFunction(key);
            

        }

    }
}
