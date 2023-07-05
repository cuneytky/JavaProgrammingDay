package day42_Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ThrowKeyword {   // used for manually throw exception

    public static void main(String[] args) {

        System.out.println("Enter your age:");  // -20
        int age = new Scanner(System.in).nextInt();

        if(age < 0){
            throw new InputMismatchException("Age can not be negative: "+age);
        }
        // -20 girince islemi tamamlar ama hata ve nedenını soyler bız ne istersek onu soyler
/*
Exception in thread "main" java.util.InputMismatchException: Age can not be negative: -20
	at day42_Exceptions.ThrowKeyword.main(ThrowKeyword.java:12)
Process finished with exit code 1
 */
        if(age > 21){
            System.out.println("You are eligible");
        }else{
            throw new RuntimeException("You must be at least 21 years old");
        }
        // yası kucuk gırınce nasıl davranacağını da tanımladık...
        // asağıdakı gıbı cıktı verdı
/*
Enter your age:
15
Exception in thread "main" java.lang.RuntimeException: You must be at least 21 years old
	at day42_Exceptions.ThrowKeyword.main(ThrowKeyword.java:24)

Process finished with exit code 1
 */
    }
}
