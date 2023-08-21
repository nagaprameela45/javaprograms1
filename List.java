import java.util.*;
class List
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      LinkedList<String> list=new LinkedList<String>();
      System.out.println("enter the size ofthe list");
      int n=sc.nextInt();
      System.out.println("enter the elements");
      for(int i=0;i<n;i++)
        {
          String element=sc.next();
          list.add(element);
        }
      System.out.println(list);
      list.add(3,"banglore");
      //list.add(45);
      list.remove(5);
      list.remove("vizag");
      list.set(1,"vijayawada");
      for(String s:list)
        {
          System.out.println(s);
        }
      Collections.sort(list);
      System.out.println(list);
      System.out.println("the size of the list is "+list.size());

    }
  }