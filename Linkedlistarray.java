import java.util.*;  
 class Linkedlistarray{  
 public static void main(String args[]){  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("prameela");  
  al.add("surya");  
  al.add("kamala");  
  al.add("kutumba rao");  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  

