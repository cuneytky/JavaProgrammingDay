package day39_Recap.Task_Device;

public class MyDevices {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("6S",-500);
        System.out.println(iphone);
        iphone.faceTime();
        System.out.println(iphone.getBrand());



    }
}
