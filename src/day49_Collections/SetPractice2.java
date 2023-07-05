package day49_Collections;
import java.util.*;
public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};
/*
        arr = new LinkedHashSet<>( Arrays.asList(arr) ).toArray(new String[0]);

        Set<String> set1 = new HashSet<>( Arrays.asList(arr));
        arr = set1.toArray(new String[0]);

        System.out.println(set1); //[Paper towels, Wooden Spoon, Book, Phone, Coke, Pen, Eggs, Milk]
                                 //*-1- duplicate atmeden
                                // *-2- random olarak cıktı aldık(Hashset ozelliği)
*/

        System.out.println( Arrays.toString(arr));//[Paper towels, Wooden Spoon, Book, Phone, Coke, Pen, Eggs, Milk]

        System.out.println("-----------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>(  new LinkedHashSet<>(list)  );

       // new LinkedHashSet<>(list); -- bununla yukarıdaki arasında ne fark var aynı cıktıyı alıyorum...
        System.out.println(list); //[1000, 300, 200, 400, 500, 600, 10, 20, 30, 40]


        System.out.println("-----------------------------------------------");

        String[] array = {"A", "A", "B", "C"};

        List<String> s =new ArrayList<>( Arrays.asList(array) );

        s.addAll(  Arrays.asList("E", "F", "G" )  );

        System.out.println(s); // [A, A, B, C, E, F, G]

        System.out.println("-----------------------------------------------");
        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */

        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>(  Arrays.asList(nums) ).toArray( new Integer[0] );
                                //buraya sıfır yazınca olan veriyi koydu. 20 yazarsan 10 tane null gelir

        System.out.println(Arrays.toString(nums) ); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        System.out.println("-----------------------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";
        //  eabcd
        //  54434
        String result = ""; //e5a4b4c4d3

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(  Arrays.asList(str.split("")) ,  each);
        }

        System.out.println(result); //e10a4b4c4d3

        System.out.println("----------------------------------------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        System.out.println( names.toArray(new String[0])[2] ); //James

        System.out.println("-----");

        //System.out.println(names.get(4));--> bu calısmadı cunku set 'ın ındex num yok' ArrayList2e cevırdik oyle getırdık.

        System.out.println( new ArrayList<>(names).get(4)  ); //Shay

        System.out.println("-----");

        for(String each : names ){
            System.out.print(each+" ");//Ahmet John James Breanna Shay
        } // burada Set oldugundan duplicate atmededn elemenları getirdi


    }
}
