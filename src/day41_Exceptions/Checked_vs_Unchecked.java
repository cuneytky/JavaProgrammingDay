package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {

        //************** unchecked exception*********************

        // calıstıktan sonra verilen hatalar..

        int a = 10;
        int b = 0;
       // System.out.println( a / b);
       // System.out.println("kaya"); // bu satırı asla calıstırmaz. crash prg. olmustu ust satırda
       /*
       occuring during the compile: unchecked.  asagıdaki hatayı verdi
       Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:9)

Process finished with exit code 1

        */
                           //0   1   2
        char[] characters = {'A','B','C'};

     //   System.out.println(characters[99]);
        /*
        asagıdaki hatayı verdi:
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 3
	at day41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:22)

Process finished with exit code 1
         */

      //  Student student = null;  // import day39_Recap.cydeoTask.Student; ile yeni tanım yaptık
      //  System.out.println(student.getName());
        /*
         asagıdaki hatayı verdi: eleman yok cunku
        Exception in thread "main" java.lang.NullPointerException
	at day41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:34)

Process finished with exit code 1

         */

        String str = "Kaya"; // kaya garbage collector oldu
        str =null;
        //System.out.println(str.toUpperCase());
        /*
        ile hata verdi
        Exception in thread "main" java.lang.NullPointerException
	at day41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:46)

Process finished with exit code 1
         */


        //************** Checked exception*********************

        // calısmadan verilen hatalar. kırmızı cızgı gelir zaten

        System.out.println("Hello");

        //   Thread.sleep(3000); // checked

        System.out.println("Cydeo");


        // FileInputStream file = new FileInputStream("path of the file");

        System.out.println("Java".charAt(1000)); // unchecked
        

    }
}
