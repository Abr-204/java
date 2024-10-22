public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("andi");
        System.out.println(sb.charAt(3));
        System.out.println(sb.insert(0,'R'));
        sb.setCharAt(2,'m');
        System.out.println(sb);
        System.out.println(sb.delete(2,4));
        System.out.println(sb.append("pur"));
    }
}
