import java.util.ListIterator;
import java.util.LinkedList;
/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)

    {
        LinkedList<String> reversed = new LinkedList<>();//new linked list
        ListIterator<String> iterator = strings.listIterator();//iterator 

        while(iterator.hasNext()){//this puts everything in reverse
            reversed.add(strings.removeLast());
        }

        strings.removeAll(strings); // gets rid of everything
        iterator = reversed.listIterator();//makes iterator point to revered instead of strings

        while(iterator.hasNext()){
            strings.add(iterator.next());//adds everything and the original order to strings
        }
    }
        
    
}