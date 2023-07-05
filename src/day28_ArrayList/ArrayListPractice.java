package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        // set() method -  get() method

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list); //[10, 20, 30, 40, 50]

        for (int i = 0; i < list.size(); i++) {
            list.set( i,  list.get(i)*2  );
        }
        System.out.println(list); //[20, 40, 60, 80, 100]

        System.out.println("---------------------------------------");

        // remove() method -->Two method: 1- remove(int index): removes the element at the given index
                             // 2 - remove(Object): removes the given object from arraylist, returns boolean
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);//[Suat, Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);
        System.out.println(employees);//[Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);
        System.out.println(employees);//[ Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);
        System.out.println(employees);//[ Neira, Ali, Hulya, Kaloyan]

        employees.remove(1);
        System.out.println(employees);//[ Neira, Hulya, Kaloyan]

        employees.remove(employees.size()-1);
        System.out.println(employees);//[ Neira, Hulya]


        boolean r1 = employees.remove("Hulya");
        System.out.println(employees);//[ Neira ]

        employees.remove("Neira");
        System.out.println(employees);// [ ]

        boolean r2 =employees.remove("Neira");
        System.out.println(employees);// [ ]

        System.out.println("r1 = " + r1); //r1 = true
        System.out.println("r2 = " + r2); //r2 = false



    }

}
/*
{1,2,3,4,5,6}
     2* =
{2,4,6,8,10,12}
 */