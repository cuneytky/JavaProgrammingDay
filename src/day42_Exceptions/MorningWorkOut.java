package day42_Exceptions;
public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println("------------Push up started----------");
        for (int i = 1; i <= 30 ; i++) {
            System.out.print("\rPush up "+i);
            sleep(1.5);
        }

        System.out.println("\n------------Push ups completed----------");
        System.out.println("--------------Pull up started-------------");

        for (int i = 1; i <= 20 ; i++) {
            System.out.print("\rPull up "+i); // buradaki r ile string"" ifadeyi sadece1
                                             // kez getirdik ve i artısını izledik. r kullanmaasa ıdık
                                             // alt alta getırıp artacaktı
            sleep(2.5);  // sureyı buradan ve bu kodla asağıdan ayarladık
        }
        System.out.println("\n------------Pull ups completed----------");
    }

    //                      2.5
    public static void sleep(double seconds)  {
        try {
            Thread.sleep( (long) (seconds * 1000) );// sure ayarı mili sn ve long olacak o yuzden cevırdık
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
Warmup task:
	MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each
			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */