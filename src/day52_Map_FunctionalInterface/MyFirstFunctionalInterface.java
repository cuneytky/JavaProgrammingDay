package day52_Map_FunctionalInterface;

@FunctionalInterface // = bunu bia getirdik
public interface MyFirstFunctionalInterface {

    // generic name vererek abstract method olustururuz

    void apply(int n);

    //void method(); ==> err verdi cunku 1 abstract- 1 interface ister. 2.si olmaz

    //*** bu dosyayı oluşturunnca Test dosyasına gidip burayaı kullanıp lamda ile method
    //    oluşturup kullanırız.
       // Aynı sayfada apply olarak kullanacaz ama nu hata vermeyecek cunku once isimle method adı tanımlıyoruz
    //  bunula kullanıyoruz.
    // 4. ornekete tek seferde kullanıma ornektir.


}
