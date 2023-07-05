package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);//[100, 200, 200, 200, 300, 400, 500]

        int num = 1;    // primitive o yuzden int ile index yazıp  kaldırabildik.
        list.remove(1);
        System.out.println(list);//[100, 200, 200, 300, 400, 500]
    /*
        Integer num1 = 200;  // nun primitive o yuzden int yazılamadı
        list.remove(200); // hata verdi
        System.out.println(list);
    */
        Integer num1 = 2000;
        boolean r =list.remove(num1);
        System.out.println(list); //[100, 200, 200, 300, 400, 500]
        System.out.println(r);   // false __remove yapamadı. liste aynı kaldı

        Integer num2 = 300;
        boolean r1 =list.remove(num1);
        System.out.println(list); //[100, 200, 200, 400, 500]
        System.out.println(r);    // true__cunku listede 300 var ve kaldırdı

        System.out.println("---------------------------------------------------");

        // clear() method --> clear(): remove all the elements of the arraylist, size will be 0

        System.out.println(list.size()); //6

        list.clear();

        System.out.println(list.size()); //0
        System.out.println(list); // []

        System.out.println("---------------------------------------------------");

        // indexOf() method : use find unique element(first and last index equal so unique)
        // 1- indexOf(Data): returns the first matching element's index number, returns int
        // 2- lastIndexOf(Data): returns the last matching element's index number, returns int


        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a =  characters.indexOf('A');
        int b = characters.lastIndexOf('A');

        System.out.println(a);//0
        System.out.println(b);//4

        System.out.println("--------------------------------------------");

        // contain() method : -- (String de specific char check etmek icin kullaıyorduk(T-F donuyor))
        // contains(Data): returns true if the element is contained in the arraylist, otherwise returns false

        boolean r2 =  characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);//r2 = true
        System.out.println("r3 = " + r3);//r3 = false

        System.out.println("--------------------------------");

        // equals() method :-- (equlas use non primitive__compaire every 2 object ArrayList)
        //equals(ArrayList): returns true if two arraylists are equal (same elements in same order), otherwise returns false

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);    // false
        System.out.println(list1.equals(list2));// true

        System.out.println("-----------------------------------------");

        // isEmpty() method : turn true or false(T-F)


        boolean r4 =  list1.isEmpty();
        System.out.println("r4 = " + r4); // r4 = false

        list1.clear();

        boolean r5 =  list1.isEmpty();
        System.out.println("r5 = " + r5); // r5 = true

        System.out.println("----------------------------------");

        // addAll() - containsAll() - removeAll() - retainAll() -->bulk operation:
          // __list olarak collection'a ceviririz Arrays.asList()__

        ArrayList<Integer> numbers = new ArrayList<>();

        //Bulk Operation: CollectionType
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7) );

        System.out.println(numbers); //[1, 2, 3, 4, 5, 6, 7]




    }

}
