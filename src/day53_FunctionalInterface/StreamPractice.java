package day53_FunctionalInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamPractice {
    public static void main(String[] args) {

        /* inteview için bu bilgiler yeterli: (işte cokça kullanılır.)
        - stream is a method
        - stream not a data structure
        - Stream is unable to change the data structure
        - Stream is a method that takes inputs from a data structure ( Array & Collection )
        - Stream reads input
        - diğer data laradan ve collectionnlardan veri alır
         */
        /*
        Methods of Stream
    After calling the stream() function from an Array/Collection,
    we can access to the methods of stream.
Method        Method        Methods
distinct()    collect()     toArray()
skip()        limit()       map()
filter()      count()       forEach()
allMatch()    anyMatch()    nonMatch() --> bu 3 u boolean
         */

// ***-- Stream sadece dataları okuyup functionları ile şekil veriyor diyebilirim sanırım...--***
        // collect ya da toString ile depolama yapmasını sağlarız:)

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
// distinct()
        list1.stream().distinct();// -> bu değişiklik yapmaz aynen getirir.
        System.out.println(list1); // [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6]

// distinct()+ collect()
        list1 = list1.stream().distinct().collect( Collectors.toList()); //collectcollectors u istedi ve yeni bir list tanımladık bununla.
        System.out.println(list1); // [1, 2, 3, 4, 5, 6] --> distinct burada tekrar edenleri ayıkladı

        System.out.println("------------------------------");

// distinct()+ collect()+ toArray()
        // arr1.stream -> olarak tanımaz hata verir. Arrays.stream(arr1)-> olarak tanıdı
        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
        Arrays.stream(arr1).distinct();// bu sekilde arr1 aynı. toArray() ile arr1 yeniden tanımladık. boylece stream calıstı.
        arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));// [1, 2, 3, 4, 5, 6]

        System.out.println("------------------------------");

// skip()
         // stream method ile skip function kullanarak, collect ile toList yapıp
         // yeni list tanımladık ve burada 5 hariç sonrasını getirdik.
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());

        System.out.println(list2); // [6, 7, 8, 9, 10]

        // asagıda stream + toString
        int[] nums2 =  {1,2,3,4,5,6,7,8,9,10};
        nums2 = Arrays.stream(nums2).skip(4).toArray();

        System.out.println(Arrays.toString(nums2));// [5, 6, 7, 8, 9, 10]

        System.out.println("------------------------------");

//limit() + skip()
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());

        System.out.println(list3); // [4, 5, 6, 7]

        System.out.println("------------------------------");

// map()
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4 = list4.stream().map( p -> p * 10 ).collect(Collectors.toList());

        System.out.println(list4);// [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]


        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        days =  days.stream().map( p -> p.substring(0, 3) ).collect(Collectors.toList());

        System.out.println(days);// [Mon, Tue, Wed, Thu, Fri, Sat, Sun]

        System.out.println("------------------------------");

//filter() ==> bunu ileirde cok kullanacaksın..
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = list5.stream().filter( p -> p%2==0).collect(Collectors.toList());
        System.out.println(evens); // [2, 4, 6, 8, 10]

        System.out.println("------------------------------");

//count() + filter()
        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
        long countJava = names.stream().filter( p -> p.equalsIgnoreCase("java")).count();
        System.out.println(countJava); // 3

//forEach()
        names.stream().filter( p -> p.equalsIgnoreCase("java")).forEach( p -> System.out.println(p));// Java-java-jAvA

        System.out.println("------------------------------");

//allMatch()    anyMatch()    nonMatch() --> bu 3 u boolean
        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean r1 = list6.stream().allMatch(p-> p%2==0);
        System.out.println(r1); // false

        boolean r2 = list6.stream().anyMatch(p->p>20);
        System.out.println(r2); // false

        boolean r3 = list6.stream().noneMatch(p->p%3==0);
        System.out.println(r3); // false


    }
}
