import java.util.Scanner;
import java.util.Stack;
//accidentally deleted everything so ill just write my own comments in
public class SentenceReverser{
    /**
     *  @param sentence
     * @return reversed sentence
     */
    public static String reverse(String sentence){
        Scanner scanner = new Scanner(sentence);
        Stack<String> stack = new Stack<>();
        String reversedSentence = "";
        while(scanner.hasNext()){
            String word = scanner.next();
            stack.push(word.toLowerCase());
            if(word.endsWith(".")){
                String lastword = stack.pop();
                lastword = lastword.substring(0, lastword.length()-1);
                stack.push(lastword);
                String temporary = "";
                while(!stack.isEmpty()){
                    String current = stack.pop();
                    if(temporary.isEmpty()){
                        current = current.substring(0,1).toUpperCase()+current.substring(1);

                    }
                    temporary += current;
                    if(!stack.isEmpty()){
                        temporary += " ";
                    }
                    stack.clear();
                }
            
            }
            scanner.close();
            
        }
        return reversedSentence.trim();

    }
   
}