package day50_Collections;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set <Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set); // [1, 2, 3, 4, 5]

        //vInteger[] array =  set.toArray(new Integer[0]);

        List<Integer> list =new ArrayList<>( set );

        System.out.println(list); // [1, 2, 3, 4, 5]
        //  List<String> names = null;
        // System.out.println(names.size());--> nulpointerException hatası verdi.cunku null yanı object yok

        System.out.println("----------------------------------------");

        // pop() ==> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println("chars = " + chars); //[A, B, C, D]

        (  (Stack)chars ).pop();

        System.out.println("chars = " + chars); //[A, B, C]


        //poll() ==> FIFO

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println(names); // [James, Jimmy, Kathy, Breanna, Max]

        ((LinkedList<String>) names).poll();

        System.out.println(names);// [Jimmy, Kathy, Breanna, Max]

        ((LinkedList<String>) names).poll();

        System.out.println(names);// [Kathy, Breanna, Max]
    }
}
/*
List vs Set vs Queue
    List                          Set                              Queue
Duplicates are allowed       Duplicates are not allowed      Duplicates are allowed
Insertion order preserved    Insertion order not preserved   Insertion order not preserved
Has index                    Does not have index              Does not have index


When to use List, Set, and Queue?
• List: If we want to represent a group of individual objects as a single entity where
duplicates are allowed, and insertion order preserved
• Set: If we want to represent a group of individual objects as a single entity where
duplicates are NOT allowed, and insertion order NOT preserved
• Queue: If we want to represent a group of individual objects prior to processing
 */
