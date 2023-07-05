package day42_Exceptions;
import java.util.NoSuchElementException;
public class ThrowKeyword2 {
    public static void main(String[] args) {


        throw new NoSuchElementException("No such Element");
        //    throw new InterruptedException();

        //  System.out.println("hello world");

        // throw new Rectangle(5,7);
        /*
        // hatanın nasıl tanımlanacağını belirledik?????
        Exception in thread "main" java.util.NoSuchElementException: No such Element
	at day42_Exceptions.ThrowKeyword2.main(ThrowKeyword2.java:7)

Process finished with exit code 1
         */




    }
}
