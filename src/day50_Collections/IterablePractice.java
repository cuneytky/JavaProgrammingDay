package day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        //  remove all the elements that are less than 4

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4){
                list.remove(i);
            }
        }

        System.out.println(list); // [2, 4, 5, 2, 4, 5, 2, 4, 5]

        System.out.println("===================================================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //  remove all the elements that are less than 4

        Iterator<Integer> it = list2.iterator(); // list2 yi iterator metodu ile bağladık
                                                //Iterator ozelliklerini kullanabilirz artiık

/*
        boolean r1 = it.hasNext();  --> eleman var mı? (hasNext)
        System.out.println(r1);        // true   // list2 de eleman olmasaydı false gelecekti.

        System.out.println(it.next()); //1 --elman varsa sonraki elmanı getirecek ilk elman geldi 1

        boolean r2 = it.hasNext();
        System.out.println(r2);       // true
                                 // --elman varsa sonraki elmanı getirecek, sonraki elamn 2
        System.out.println(it.next()); // 2
*/

        while(it.hasNext()){      // eleman oldugu surece(hasNext ile sorduk) devam edecek
            if( it.next()  < 4 ){ // if sonraki eleman (next) 4 den kucukse
                it.remove();      // onu kaldır (remove)
            }
        }                        // 4 den kucukler gelmedi:
        System.out.println(list2); //[4, 5, 4, 5, 4, 5]

        System.out.println("===================================================");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for( Iterator<Integer> i=list3.iterator() ; i.hasNext() ; ){ // i++, i-- gibi iterator koyulmaz
            if(i.next() < 4 ){
                i.remove();
            }
        }

        System.out.println(list3); //[4, 5, 4, 5, 4, 5]

        System.out.println("===================================================");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list4.removeIf( each ->  each < 4 );

        System.out.println(list4); //[4, 5, 4, 5, 4, 5]

    }
}
/*
Iterable
• Parent interface of Collection interface
• Allows the object to be Iterated by using Iterator
• Iterator is used when we want to remove elements whilst you iterate over
a collection

How to use Iterator?
• We can obtain the Iterator by using the iterator() method of an Iterable
• Iterator provides the ready methods that can be used while traversing the collections:
• hasNext( )
• next( )
• remove( )


 */
