class School{
    String name;
    int age;
    int marks;
    String subject;
    static int birth;
}
class Student extends School{
    public void about(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.birth);
    }
    public void print(int marks){
        System.out.println(marks);
    }
    public void print(String subject){
        System.out.println(subject);
    }
    // Student(int m, String s) {
    // this.marks = m;
    // this.subject = s;
    // }
    // Student(Student st2){
    //     this.marks=st2.marks;
    //     this.subject=st2.subject;
    // }

}

public class OOPS
{
    public static void main(String[] args) {
        Student st1=new Student();
        st1.name="Abhay";
        st1.age=21;
        st1.marks=12;
        st1.subject="English";
        st1.birth=2003;
//  		Student st2=new Student(st1);
        st1.about();
        st1.print(st1.marks);
        st1.print(st1.subject);
// 		st2.print(marks);
// 		st2.print(subject);
    }
}
