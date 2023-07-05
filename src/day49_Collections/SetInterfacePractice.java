package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("list = " + list);//list = [10, 200, 300, 40, 90, 10, 200, 300, .... 90, 10, 200, 300, 40, 90] normalde hepsini bir araya getiriyorudu.
                                             // ama set duplicate etmez aşgıda farkı gorecez:
        System.out.println( list.get(4) ); // 90

        System.out.println("-------------------------------------------");

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("hashSet = " + hashSet); // hashSet = [null, 200, 40, 10, 90, 300] => random list yaptı. duplicate yok!!!
        //  System.out.println( hashSet.get(4) );--> bu calısmadı ındex number yok cunku

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("linkedHashSet = " + linkedHashSet); // linkedHashSet = [10, 200, 300, 40, 90, null]

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        // treeSet.addAll(Arrays.asList(null,null,null)); --> .NullPointerException--verdi treeSet null almaz!!!


        System.out.println("treeSet = " + treeSet);  // treeSet = [10, 40, 90, 200, 300]

        //  String str = null;
         //System.out.println(str.charAt(0));  --> .NullPointerException--verdi index number yok !!!


    }

}
/*
            II- Set Interface (interview da kullandırmazlar-duplicate izin vermedği için)
    • Child interface of Collection
    • Duplicates are not allowed   --> en onemli ozellık 1.
    • Insertion order not preserved
    • Does not have index         -->  en onemli ozellık 2. dıkkat ındex yok !! tum setlerde

        1- HashSet Class
    • Implements the Set interface
    • Maintains the random order  --> mutlaka order oma random
    • Accepts null values

*** genelde bunu kullanacaz hızlı-random order yaptığından

        2 - LinkedHashSet Class
    • Child class of HashSet
    • Maintains the insertion order --> düzenli order
    • Accepts null values
*** en zengini bu (hashset ve set e gore--cunku ınherıt edıyor bunları)

        3 - TreeSet Class
    • Implements the SortedSet interface
    • Maintains the sorted (Ascending) order --> artan duzen dıkkat!!
    • Does not accept null values

Collection (I):
		List (I): Has Index, Allows Duplicates

		Set (I): Does not have index, does not allow duplicates
			HashSet (C): order is random
			LinkedHashSet (C): keeps the insertion order
			TreeSet (C): keeps sorted order, does not accept null
		Queue(I):
 */