public class Permutation
{
    public static void permutation(String str,String perm,int index){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            permutation(newStr,ch+perm,index+1);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        permutation(str,"",0);
    }
}

