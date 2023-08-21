import java.util.*;
class Removearraylist{
  public static void main(String args[]){
     ArrayList<String> alist =new ArrayList<String>();
    alist.add("prameela");
    alist.add("monika");
    alist.add("lavanya");
    alist.add("devi");
    alist.remove("devi");
    alist.remove(2);
    System.out.println(alist);

  }
}