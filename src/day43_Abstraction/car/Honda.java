package day43_Abstraction.car;

// 1 - sub-class yapınca ilk hangi perentın onu yap (extends ile)
//    * fakat constructors ile extend edince de hata verecek. abstract ekleyınce hata gıdecek
//      ama biz burasını abstract yapmayız burası child ve parentten gelen ozelliği istiyor.
//      yani start özellikini tanımlayınca hata gıdecek.
public final class Honda extends Car { // final yazabiliriz son hali ve değişmayackse ve bu rası child
    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    // 2 - more visible olmalı yani public ile methodu tanımlarız.
    public void start(){
        System.out.println("Twist the key to ignition");
    }

    // 3 - *** override ile bunu yapabiliriz ama burada metod tanımlamazsak parenttaki tanım gelirdi
    // burada(abstarct) parentta tanım yok, chılddan tanım istıyor.

    // 4 - baska bı method ekleyebiliriz....
    // 5 - ilişkisini pop grafikten bakabılırsın seklide farlı abstarct dosyanın dıkkkat et...
}
