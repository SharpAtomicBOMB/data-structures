import java.util.PriorityQueue;
import java.util.Queue;
/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        //Create a to do list
        //The WorkOrder class has a priority and descrption
        Queue<WorkOrder> toDo = new PriorityQueue();
        //lower number means priority is more important, so #1 is most important
        toDo.add(new WorkOrder(3, "Water Plants"));
        toDo.add(new WorkOrder(2, "Make Dinner"));
        toDo.add(new WorkOrder(1, "Conquer Europe"));
        toDo.add(new WorkOrder(9, "Play Games"));
        toDo.add(new WorkOrder(1, "Study for Ch. 15 Test"));
        //objects are not stored in order
        System.out.println(toDo);
        
        
        
        
        //objects will be removed in priority order
        while(toDo.size() > 0){
            System.out.println(toDo.remove());

        }

    }
}
