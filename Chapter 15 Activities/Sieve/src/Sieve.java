import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 2; i<=n; i++){
            set.add(i);
        }
        for(int i = 2; i<n/2;i++){
            Iterator<Integer> iterator = set.iterator();
            while(iterator.hasNext()){
                int h = iterator.next();
                if(h % i == 0 && h>i){
                    iterator.remove();
                }
            }
        }
        System.out.println(set);







    }
}
