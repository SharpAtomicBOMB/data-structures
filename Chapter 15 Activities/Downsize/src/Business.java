import java.util.Iterator;
import java.util.LinkedList;
/**
 * Business utility methods.
*/
public class Business
{
    /**
      * Removes every nth element from the linked list
      *
      * @param employeeNames the linked list to remove from
      * @param n                 the parameter to determine "nth"
     */
    public static void downsize(LinkedList<String> employeeNames, int n)
    {
        Iterator<String> downsizeIterator = employeeNames.iterator();
        int employeeNumber = 0;
        
        while(downsizeIterator.hasNext()){
            downsizeIterator.next(); 

            employeeNumber++; 
            if(employeeNumber%n == 0){
                downsizeIterator.remove(); 
            }
        }
            System.out.println(employeeNames);
        }
    }