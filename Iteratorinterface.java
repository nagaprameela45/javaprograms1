//Iterator interface
import java.util.HashSet;
public class Iteratorinterface
{
    public static void main(String[] args) {
        Set<String> hs=new HashSet<String>();
        hs.add("apple");
        hs.add("potoato");
        hs.add("pumpkin");
        hs.add("grapes");
        System.out.println("the elements are");
        Iterator<String> itr=hs.iterator();
        while(itr.hasNext())
        {
           System.out.println(itr.next());
        }

    }
}