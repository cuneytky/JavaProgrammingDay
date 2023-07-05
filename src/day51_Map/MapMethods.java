package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {
        /*
        Methods of Map:
		put(key, value) : inserts the given key and value to map
		get(key)        : returns the value of the given key
		replace(key, newValue): replaces the value of the given key with the given new value
		remove(key)     : removes the given key and its value from the map
		containsKey(key): returns true if the given key is conatined in the map, otherwise returns false
		containsValue(Value): returns true if the given value is conatined in the map, otherwise returns false
		isEmpty()      : returns true if the size of the map is 0, otherwise returns false
		equals(Map)    : returns true if the given Map is equal with the current map, otherwise returns false
		clear()        : removes all the pairs from the map
		---------------------------
		keySet()  : returns all the keys of the map, returnType is Set
		values()  : returns all the values of the map, returnType is Collection
		entrySet(): returns all the entries (Entry: key & value) of map
				getkey()
				getValue()
				setValue()
         */

        // student name & score:

        // put() - size()
        Map<String, Integer> students = new HashMap<>();

        System.out.println(students);  // {}
        System.out.println(students.size());// 0

        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);

        System.out.println(students);// {Alex=96, Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=87}
        System.out.println(students.size());// 7

        System.out.println("-------------------------------");

        // get() -->display the score of Alex:
        System.out.println(students.get("Alex")); // 96


        // replace() --> Ali' score to 90
        students.replace("Ali", 90 );
        System.out.println(students); //{Alex=96, ..., Serkan=97, Ali=90}

        //remove()
        students.remove("Alex");
        System.out.println(students);//{Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=90}

        students.remove("Ozan");
        System.out.println(students);//{Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}

        System.out.println("-------------------------------");

        // containsKey() - containsValue() - isEmpty()
        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1); // false
        System.out.println(r2); // true

        boolean r3 = students.containsValue(97);
        System.out.println(r3); // true

        System.out.println(students.isEmpty()); //false

        System.out.println("-------------------------");

        // clear() - putAll() -equals()
        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1); // map1 = {Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}
        System.out.println("map2 = " + map2); //map2 = {Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}

        System.out.println(map1 ==  map2);    // false
        System.out.println(map1.equals(map2));// true

        map1.clear();
        map2.clear();

        System.out.println(map1); // {}
        System.out.println(map2); // {}


    }

}
