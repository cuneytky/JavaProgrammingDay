package day33_Statics.Tasks;

public class T04_IphoneObject {

    public static void main(String[] args) {

        T04_Iphone t04Iphone1= new T04_Iphone("I5",50000,"black",8);
        System.out.println(t04Iphone1);
        System.out.println(T04_Iphone.brand);
        System.out.println(T04_Iphone.OS);
        System.out.println(T04_Iphone.madeIn);
        System.out.println(T04_Iphone.faceTime);

    }

}
