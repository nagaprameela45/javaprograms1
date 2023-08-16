import java.util.Scanner;
class Bookarray
 {
 int id;
String name;
 String author;
   int year;
public void display()
{
 System.out.println("Books details are");
   System.out.println("id "+id+" "+"name "+name+" "+"author "+author+" "+"year "+year);
}
 public static void main(String args[])
 {
Scanner sc=new Scanner(System.in);
  Books books[]=new BBookooks[5];
for(int i=0;i<books.length;i++)
        {
  books[i]=new Books();
System.out.println("enter books "+(i+1)); System.out.println("enter id");
  books[i].id=sc.nextInt();
  System.out.println("enter name");
  books[i].name=sc.next();
          System.out.println("enter author");
         books[i].author=sc.next();  System.out.println("enter year");
 books[i].year=sc.nextInt();

        }

      for(int i=0;i<books.length;i++)

        {

          books[i].display();

        }

    }


    }
         

          
          
          
          
    