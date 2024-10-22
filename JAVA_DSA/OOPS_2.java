class Shop{
    String color;
    int price;
    private String quality;
    public String getquality(){
        return this.quality;
    }
    protected void setquality(String q){
        this.quality=q;
    }
}
class Item extends Shop{
    public void print(){
        System.out.println(color);
    }
}
class Price extends Shop{
    public void print1(){
        System.out.println(price);
    }
    public void print(){
        System.out.println(color);
    }
}
public class OOPS_2
{
    public static void main(String[] args) {
        Price p=new Price();
        p.color="Red";
        p.price=500;
        p.setquality("poor");
        System.out.println(p.getquality());
        p.print();
        p.print1();
    }
}