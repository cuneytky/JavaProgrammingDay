package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks_BenimNotum {
    public static void main(String[] args) throws FileNotFoundException {
/*
        System.out.println("Test started");
        System.out.println(9/0);
        System.out.println("Test Completed");

 */
        /*
   Test started
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day41_Exceptions.test.main(test.java:6)

Process finished with exit code 1
         */
        //alt tarafa gecıp test completed da yazdırmadı..
        System.out.println("Test started");
        try{
            System.out.println ( 9/0 ); //--->  hata olmasını bekledıgımız yerı try blokuna alırız
            System.out.println("Try Block");

        }catch (ArithmeticException e){ // ---> muhtemel hata (burada aritmetik) durumunda ne yapmalıyım catch icine yazarız...
                                        // e variable a atadık hatayı ve sistemin çalışmasına devam ettirdik.
            System.out.println("Catch Block"); // burası tercıhe baglı ne yapmasını ıstersen yaz
            System.out.println("Arithmetic Exception was occurred");

        }
        System.out.println("Test1 Completed");
        /*
        Test started                 tam cıktıyı aldık. hata vermedi hatayı e ıcıne atadı.
        Catch Block
        Arithmetic Exception was occurred
        Test1 Completed
         */

        System.out.println("------------------------------");
        /*
          System.out.println("Test2 started");
        int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[200]);
        System.out.println("Test2 Completed");
         */
// bunu calıstırınca:
        /*
        Test2 started
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5
	at day41_Exceptions.test.main(test.java:9)

Process finished with exit code 1
         */
 // hatasını verdi.
 // *** diğer calsıtırma yontemınde ise:
 /*
     System.out.println("Test2 started");
        int[] numbers = {1,2,3,4,5};
        try {
            System.out.println(numbers[200]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            e.printStackTrace();   ---> bununla tamamladık ama sonunda hata detayı verdı
                                    --> detaylı acıklama ıstenen durumda kullan
                                    ---> genellıkle bunu kullanacaksın detaylı report almak ıcın

            // System.out.println( e.getMessage() ); --> kısa ozet ıstersen bunula kullan
          bunun cıktısı da:
             Test2 started
             Index 200 out of bounds for length 5 --> hatayı cıktı ıcınde kısaca ozetledi
             Test2 Completed

Process finished with exit code 0
        }
        System.out.println("Test2 Completed");
  */
  // yine hata verdi asagıdaki gibi ama calıstı.
        /*
        Test2 started   ---> calısan kısımlar
        Test2 Completed ---> calısan kısımlar
java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5
	at day41_Exceptions.test.main(test.java:9)
Process finished with exit code 0
         */
// dogru calısma seklı ise:
        System.out.println("Test2 started");
        int[] numbers = {1,2,3,4,5};
        try {
            System.out.println(numbers[200]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("runtime exception but run");
        }
        System.out.println("Test2 Completed");
        /*
        Test2 started      cıktısı ıle calıstırdı....
runtime exception but run
Test2 Completed
         */

        System.out.println("--------------------------------------------------");
        /*
           System.out.println("Test3 started");
        System.out.println("Cydeo".substring(2, 0));// -->unchecked expected
        System.out.println("Test3 completed");
         */
        // bunun hatası ve cıktısı:
        /*
        Test3 started
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 2, end 0, length 5
	at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)
	at java.base/java.lang.String.substring(String.java:1874)
	at day41_Exceptions.test.main(test.java:9)

Process finished with exit code 1
         */
        System.out.println("Test3 started");

        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch (RuntimeException e){
            e.printStackTrace(); // full detay verdırdı
        }
        System.out.println("Test3 completed");

        //bunun cıktısı ise:
        /*
        Test3 started
        Test3 completed
--------------------------------------------------
java.lang.StringIndexOutOfBoundsException: begin 2, end 0, length 5
	at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)
	at java.base/java.lang.String.substring(String.java:1874)
	at day41_Exceptions.test.main(test.java:8)
Process finished with exit code 0
         */

        System.out.println("--------------------------------------------------");
        System.out.println("Hello");

        try {
            Thread.sleep(3000);  //--> bu satırı yalnız yazınca ne hatası oldugu kırmızı cizilli oldugundan gorup unu
        } catch (InterruptedException e) {// <--  buraya getirip yazıp try catch ile yok sayabılırız 3 sn sonra hello dan sonra cydeo gelır cıktıdada
            e.printStackTrace(); // yana cozum ıcın yanına gelınce otamatık try catch ıcıne alır
        }
        System.out.println("Cydeo");

        System.out.println("------------------------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
