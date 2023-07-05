package day49_Collections;
import java.util.*;
public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("priorityQueue = " + priorityQueue);//priorityQueue = [10, 40, 300, 200, 90]

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("arrayDeque = " + arrayDeque);    // arrayDeque = [10, 200, 300, 40, 90]

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("linkedList = " + linkedList);   // linkedList = [10, 200, 300, 40, 90]

        System.out.println("-------------------------------------------------");

        priorityQueue.poll(); // poll method ilk elemanı siler

        System.out.println("priorityQueue = " + priorityQueue);// priorityQueue = [40, 90, 300, 200]

        arrayDeque.poll();

        System.out.println("arrayDeque = " + arrayDeque);// arrayDeque = [200, 300, 40, 90]

        linkedList.poll();

        System.out.println("linkedList = " + linkedList);// linkedList = [200, 300, 40, 90]

        System.out.println("-------------------------------------------------");

        // System.out.println(priorityQueue.get(1));
        //  System.out.println(arrayDeque.get(1));
        //   System.out.println( ( linkedList.get(1) );
        //   *** bunların 3 u de hata verdi get yalnız calısmadı.

           System.out.println( ( (List)linkedList ).get(1) ); // 300

        System.out.println(((LinkedList<Integer>) linkedList).get(1));// 300


    }

}
/*
Queue Interface
• Child interface of Collection
• Duplicates are allowed
• Insertion order not preserved
• First-in, First out order (FIFO)

PriorityQueue Class
• Implements the Queue interface
• Maintains the random order
• Does not accept null values

ArrayDeque Class
• Implements the Deque interface
• Maintain the insertion order
• Accepts null values


 */