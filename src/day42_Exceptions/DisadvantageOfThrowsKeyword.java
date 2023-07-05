package day42_Exceptions;
public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args)  {

        System.out.println("Hello");

        //    sleep(2.5); // throws -->custom metod burada calısmadı--termenantly solutıon
                          // ama asagıdakı gıbı try catch baska yerden cağırıp kullandık...

        System.out.println("Hello world");

        System.out.println("-------------------------");

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5); // try & catch-->permanantly solutıon

        System.out.println("Cydeo");
    }

    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep( (long) (seconds * 1000) );
    }
}
