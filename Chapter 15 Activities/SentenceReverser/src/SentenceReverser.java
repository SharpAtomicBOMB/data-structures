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
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
        String finalsentence = "";
    	Scanner scanner = new Scanner(sentence);
        //for(int i = 0; sentencee.length()>0)
        Stack<String> sentence1 = new Stack<>();
        Stack<String> sentence2 = new Stack<>();
        boolean working = true;
        while(working == true){
            String word = scanner.next();
            while(!(word.substring(word.length()-1).equals("."))){
                System.out.println(word.substring(word.length()-1));
                sentence1.push(word);
                System.out.println(sentence1);
                word = scanner.next();
            }
            if (word.substring(word.length()-1).equals(".")){
                working = false;
            }
        }
        sentence1.push(word);
       
        System.out.println(sentence1);
        return finalsentence;

        
        






    }
}
