package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
            /*
 HashMap Class
• Implements the Map interface
• Maintains the random order
• Accepts null value as a key
         */
        //    key     value
        Map<Integer, String> hashMap = new HashMap<>();// dezavantajı random olması- ama en cok kullanılan
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isabella");     // bu ahmeti ezdi. ahmet cıktı olmaz
        hashMap.put(6, null);
        hashMap.put(7, null);
        hashMap.put(8, null);
        hashMap.put(null, null);       // iki tarafta null alır en son bu olursa cıktı da verır-ama ezer dıkkat
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya")   ; // son atanan hulya o cıkar.key duplicate etmez, value eder.
                                       //*** dıkkat key unique ve value = null olabilir. random cıktı verır

        System.out.println("hashMap = " + hashMap);
//hashMap = {null=Hulya, 3=Jack, 20=George, 5=Isabella, 6=null, 7=null, 40=Emma, 8=null, 10=Arthur}

         System.out.println(hashMap.get(7));  //--> index number yok ama key ile cagırabılısın.

        System.out.println("-----------------------------------------");
/*
LinkedHashMap Class
• Child class of HashMap
• Maintains the insertion order
• Accepts null value as a key
 */

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);
//linkedHashMap = {10=Arthur, 20=George, 3=Jack, 40=Emma, 5=Isabella, null=Hulya}

        System.out.println("-----------------------------------------");

          /*
TreeMap Class
• Implements the SortedMap Interface
• Maintains the sorted (Ascending)order
• Does not accept null as a key
         */
        Map<Integer, String> treeMap = new TreeMap<>(); // Key can not be null, value can be null and duplicated
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella");
        treeMap.put(7, null);
        //treeMap.put(null,"ali"); //.NullPointerException hatası verdi--> • Does not accept null as a key

        System.out.println("treeMap = " + treeMap);
        //treeMap = {3=Jack, 5=Isabella, 7=null, 10=Arthur, 20=George, 40=Emma}

        System.out.println("-----------------------------------------");

        /*
Hashtable Class
• Implements the Map interface
• Maintains the random order
• Does not accept null as a key   --> hasMap ten farkı!!!
• Synchronized (Thread-Safe)     --> en onemli farkı bu doolayısıyla "yavas"
 */
        Map<Integer, String> hashtable = new Hashtable<>(); // key and value both can not null
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
      // hashtable.put(6, null); // bununla cıktı alsam "nullPointexception verir null almaz

        System.out.println("hashtable = " + hashtable);
//hashtable = {10=Arthur, 20=George, 40=Emma, 5=Isabella, 3=Jack}


        //   String str = null;
        // System.out.println(str.toUpperCase());
       //.NullPointerException hatası verdi--> yukarıdakide aynı mantık..


    }
}
/*
Map (I): pari of collection
		 does not support primitives
		 size is dynamic
		 key MUST be unique, value can be duplicated

		HashMap (C): both key and value can be null
					Maintains the random order

		LinkedHashMap (C): both key and value can be null
						maintains the insertion order

		TreeMap (C): key can not be null, but value can be null
					Maintains the sorted order

		Hashtable (C): both key and value can NOT be null
						Maintains the random order
						synchronized
 */