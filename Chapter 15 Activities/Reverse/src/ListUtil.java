import java.util.Iterator;
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
        
        Iterator<String> iterator = strings.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
}