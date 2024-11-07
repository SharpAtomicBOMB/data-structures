/**
   This class demonstrates the tree class.
*/
public class TreeDemo
{
   public static void main(String[] args)
   {
      Tree t1 = new Tree("Anne");
      Tree t2 = new Tree("Peter");
      t1.addSubtree(t2);
      Tree t3 = new Tree("Zara");
      t1.addSubtree(t3);
      Tree t4 = new Tree("Sonia");
      t2.addSubtree(t4);
      Tree t5 = new Tree("Mike");
      t2.addSubtree(t5);
      Tree t6 = new Tree("Sam");
      t2.addSubtree(t6);
      Tree t7 = new Tree("Jane");
      t2.addSubtree(t7);
      System.out.println("Expected: Anne Peter Sonia Mike Jane Sam Zara");
      t1.depthFirst();
   }
}
