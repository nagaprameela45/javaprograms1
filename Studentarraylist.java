import java.util.ArrayList;

class Student

{

    int rollno;

    String name;

    String address;

    long mobile;

    Student(int rollno,String name,String address,long mobile)

    {

        this.rollno=rollno;

        this.name=name;

        this.address=address;

        this.mobile=mobile;


    }


}

 

public class Studentarraylist

{

    public static void main(String[] args) {

        ArrayList<Student> al=new ArrayList<Student>();

        Student student1=new Student(123,"pushpa","vijayawada",93240234233L);

        Student student2=new Student(124,"sardar","eluru",94303243242L);

        Student student3=new Student(234,"nazumuddin","vizag",95049092384L);

        al.add(student1);

        al.add(student2);

        al.add(student3);

        //using for each 

        for(Student student:al)

        {

            System.out.println(student.rollno+" "+student.name+" "+student.address+" "+student.mobile);

        }

    }

}