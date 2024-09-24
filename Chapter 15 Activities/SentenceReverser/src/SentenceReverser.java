import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
        // Complete this method. Use a Stack.

        Stack<String> sStack =new Stack<String>(); 
        String revword = new String(""); 

        while (scanner.hasNext())
        {
            String temporary = scanner.next();
            sStack.push(temporary);

            if(temporary.contains("."))
            {
                for (int i  = 0; i < sStack.size();){
                    String stackword = sStack.pop(); 
                   
                    if (stackword.substring(stackword.length()-1).equals(".")){
                        stackword = stackword.substring(0, stackword.length()-1);
                        stackword = stackword.substring(0,1).toUpperCase() + stackword.substring(1);  
                    }

                    if (i == sStack.size()){
                        stackword = stackword.substring(0,1).toLowerCase() + stackword.substring(1);  
                        stackword = stackword + ".";
                    }


                    revword = revword + " " + stackword;  
                }

                sStack.clear(); 
            }
        }
        scanner.close();
        return revword;
    }
}