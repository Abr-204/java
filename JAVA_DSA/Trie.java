public class Trie {
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.length()-'a';
            if(curr.children[index]==null){
                curr.children[index]=new Node();
            }
            if(i==word.length()-1){
                curr.children[index].eow=true;
            }
            curr=curr.children[index];
        }
    }
    public static boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int index=key.length()-'a';
            if(curr.children[index]==null){
                return false;
            }
            if(i==key.length()-1 && curr.children[index].eow==false){
                return false;
            }
            curr=curr.children[index];
        }
        return true;
    }
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=0;i<=key.length();i++){
            String firstPart=key.substring(0,i);
            String secondPart=key.substring(i);
            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }
    public static boolean startsWith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int index=prefix.length()-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return true;
    }
    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNode(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str="ababa";
        String words[]={"the","a","there","their","any"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        for(int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            insert(suffix);
        }
        System.out.println(search("a"));
        System.out.println(search("fuck"));
        System.out.println(wordBreak(key));
        System.out.println(countNode(root));
    }
}
