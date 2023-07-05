package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        // add() method
        // add(Data):   adds the data after the last index of the ArrayList
        // add(index, Data):   inserts the data at the given index

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(30);//3
        numbers.add(40);//5
        numbers.add(50);//6

        System.out.println(numbers);    //[10, 20, 30, 40, 50]

        numbers.add(2,25);// 2
        System.out.println(numbers);    //[10, 20, 25, 30, 40, 50]

        numbers.add(4,35);// 4
        System.out.println(numbers); //[10, 20, 25, 30, 35, 40, 50]

        System.out.println("-------------------------------------------");

        // size() method ==> size(): returns the total number of elements

        System.out.println(numbers.size()); //7

        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex); //lastIndex = 6

        System.out.println("-------------------------------------------");

        // get() method ==> get(index): returns the element at the given index

        Integer num = numbers.get(3);
        System.out.println("num = " + num); // 30

        System.out.println("-----------------------------------------");

        // get() - size() method

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i) +" "); //10 20 25 30 35 40 50
        }

        System.out.println("-----------------------------------------");

        // set() method ==> set(index,  Data): replaces the element at given index with the new element.

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list);// [Java, Python, Java, C#, Ruby]

        list.set(2,"JavaScript");// replace
        System.out.println(list);//[Java, Python, JavaScript, C#, Ruby]

        list.set(3,"C++");
        System.out.println(list); //[Java, Python, JavaScript, C++, Ruby]

        System.out.println("---------------------------------------------");








    }

}
