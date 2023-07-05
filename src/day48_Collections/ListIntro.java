package day48_Collections;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {
 // I- List Interface:
        //List<Integer> list1= new Lİst<>(); list kısmı hata verdi cunku bu arraylıst

        // List yazınca --Lİst<E> java.util-- import et. Ve List altında 4'unu de
        // yazınca ayrı ayrı import ediyoruz.
        // Bunlar child class List'in (4 classes implemented the List)

       // List< Integer> list1= new ArrayList  <>();
       // List< Integer> list1= new LinkedList <>();
       // List< Integer> list1= new Vector     <>();
       // List< Integer> list1= new Stack      <>();

        /*    1- ArrayList
        • Implements the List interface
        • Internally uses array
        • Retrieving the element is faster

        *** daha hızlı cunku => List has get method. But Collection has NOT get method

        *** All Collection has index number? ==> NO. ArrayList has index number and use get method  so faster than other classes

            2- LinkedList Class
        • Implements the List interface
        • Internally uses doubly linked list---> main advantage, arrayList elemanlar connected ama bunlar not connected, pointerı var( tam analamdım)
        • Each value will have pointer to the next value
        • Inserting and deleting the element is faster ( diğer üçünden arraylist, vector,LinkedList)
*** bu aynı zamanda Queue nın de imlement eder. bu yuzden FİFO özelliği var ve ındex num oldugunda Queue de o oz buradan alır
*** Queue ve list aynı zamanda imlement eden özelliği olması bunu ozel kılar unutma
            3- Vector Class
        • Implements the List interface (Liste arayüzünü uygular)
        • Internally uses array (Dahili olarak dizi kullanır)
        • Is Synchronized (thread-safe)

        - similar arrayList, because Internally uses array.
        - different arrayList, Is Synchronized --> bunu tam anlamak ıcın thread. process'i anlamak gerek:

       * Is Synchronized so slower sooo vector is slower
-------------
Process
• Programs that are scheduled for execution in the CPU
• An instance of a program running on a computer.
• A process has code, data, heap and other segments

Thread
• A subset of a process
• A sequence of execution within a process
• Every single process at least have one thread
• Shares all the resources of process

Multi-threading
• Two or more threads are being executed within the process

Synchronized (Thread-safety)
• Process of controlling the access of multiple threads to any shared resource
• Only one thread to access the shared resource at a time (Thread-safety)
---------------------
            4 - Stack Class
      • Child class of Vector
      • Is Synchronized (thread-safe)
      • Last-in, first out order (LIFO) --> vectorden farkı burasıdır.

*** pop ozellığı sadece Stack ıcın gecerli diğerleri için değil.

Summary ==> ArrayList vs LinkedList vs Vector vs Stack:
		All of them are Lists (allows duplicates, has index)
		ArrayList : searching elements are faster
		LinkedList: insertion & deletion of elements are faster
		Vector    : Same as ArrayList but Synchronized
		Stack     : Has Last-in-first-out (LIFO) logic

         */

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list1.get(0)); // 10


        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list2.get(0)); // 10


        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list3.get(0)); // 10


        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list4.get(0)); // 10

        System.out.println("-------------------------------------------------------");

        System.out.println(list4); // [10, 20, 30, 40, 50, 60]

        // list4.pop(); // --> Stack<Integer> list4 = new Stack<>(); -> yazınca hata vermez
        ((Stack) list4).pop();  // --> yada boyle yazmalıyız.
    // *** Stack ozellığı son giren ılk cıkar -> Last-in, first out order (LIFO)
        // pop ile cıkardık.
        System.out.println(list4);  // [10, 20, 30, 40, 50]

        ((Stack) list4).pop();

        System.out.println(list4);  // [10, 20, 30, 40]

    }

    public synchronized void method1(){

    }
}

