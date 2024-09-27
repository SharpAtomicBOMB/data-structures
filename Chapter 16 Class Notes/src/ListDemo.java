/**
 *   A program that demonstrates the LinkedList class
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList students = new LinkedList();
        students.addFirst("Isaac");
        students.addFirst("Cornball");
        students.addFirst("Parmesean");
        students.addFirst("yushian");
        
        System.out.println(students);
    }
}
