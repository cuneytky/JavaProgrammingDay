package day42_Exceptions;

public class ThrowsKeyword { // coklu bloklarda bunun kullanımı--> avantajı
                             // try-catch ile arasındaki fark ınterview sorusu
    public static void main(String[] args) throws InterruptedException{

        System.out.println("----------test 1--------------");

        System.out.println("hello");
        Thread.sleep(3000);     // buraları hata verınce throws ile cozduk hatayı uzerıne gelıp aldık main adına ekledık
        System.out.println("cydeo"); // ılk cozum onerısı de budur

        System.out.println("----------test 1 completed--------------");

        System.out.println("----------test 2--------------");

        System.out.println("hello");
        Thread.sleep(3000);
        System.out.println("EU11");

        System.out.println("----------test 2 completed--------------");
    }
}
