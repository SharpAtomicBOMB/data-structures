import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a map
 * whose keys are the first letters of the words and
 * whose values are sets of words that start with
 * that same letter.
 * Then print out the word sets in alphabetical order.
 * Use the Java 8 merge() feature.
*/
public class FirstLetterMap
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/FirstLetterMap/FirstLetterMap2/src/test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            // Create your map here
            Map<Character,Set<String>> mapfirst = new HashMap<>();
            

            while (in.hasNext())
            {
                String word = clean(in.next());
                Character c = word.charAt(0);

                // Update the map here
                // Use the Java 8 merge method
                Set<String> val_word = new HashSet<>();
                val_word.add(word);
                mapfirst.merge(c, val_word, (v1, v2) -> {v1.addAll(v2); return v1;});
                
            }
            ArrayList<Character> arr1 = new ArrayList<Character>();
            Set<Character> z = mapfirst.keySet();
            for(char i:z){
                arr1.add(i);
            }
            Collections.sort(arr1);
            // Print the map here in this form
            // a: [a, able, aardvark]
            for(Character i: arr1){
                System.out.println(i+" "+mapfirst.get(i)); 
            }
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }

}
