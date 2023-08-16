import java.util.*;
class StudentManager
{
private int rollno;
private String name;
private String address;
public void setRollno(int rollno){
this.rollno=rollno;
}
public int getRollno(){
return this.rollno;
}
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
public void setAddress(String address){
this.address=address;
}
public String getAddress()
{
return this.address;
}
}
class StudentManager

 

{

 

Scanner sc=new Scanner(System.in);

 

int size=sc.nextInt();

 

Student student[]=new Student[size];

 

public void createStudent()
{
for(int i=0;i<size;i++)
{

 

student[i]=new Student();

 

System.out.println("enter rollno");

 

int rno=sc.nextInt();
student[i].setRollno(rno);

 

System.out.println("enter name");
String name=sc.next();

 

student[i].setName(name);

 

System.out.println("enter address");

 

String address=sc.next();

 

student[i].setAddress(address);

 

}

 

}
public void display()

 

{

 

for(int i=0;i<size;i++)
{
System.out.println(student[i].getRollno()+" "+student[i].getName()+" "+student[i].getAddress());

 

}
}
public void updateByRollno(int rollno){
for(int i=0;i<size;i++)
{
if(rollno==student[i].getRollno())
{
student[i].setAddress("hyd");
System.out.println("student is updated");
display();
}
}
}
public void updateByName(String name)
{
for(int i=0;i<size;i++)
{
if(name.equals(student[i].getName()))
{
student[i].setAddress("vijayawada");
System.out.println("student record is updated");
display();
}
}
}

}
class Main
{
public static void main(String args[])
{

 

StudentManager st=new StudentManager();
do{
System.out.println("1.creating student record2.displaying student records 3.updateByRollno 4.exit");
System.out.println("enter the choice");
Scanner sc=new Scanner(System.in);
int choice=sc.nextInt();
switch(choice)
{
case 1:
st.createStudent();
break;
case 2:
System.out.println("All Student details are");
st.display();
break;
case 3:
System.out.println("enter the rollno that you want to update the student's address");
int rollno=sc.nextInt();
st.updateByRollno(rollno);
break;
case 4:
System.out.println("exiting the program");
System.exit(0);
}

 

}while(true);
}

 

 

}


