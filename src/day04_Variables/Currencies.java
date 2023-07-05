package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        int dollar = 1000;
        double lira = dollar * 18.89;
        double euro = dollar * 0.94;
        double jpy = dollar * 135.90;
        double pound = dollar * 18.89;
        double CAD = dollar * 1.36;

        System.out.println("dollar = " + dollar);
        System.out.println("lira   = " + lira);
        System.out.println("euro   = " + euro);
        System.out.println("jpy    = " + jpy);
        System.out.println("pound  = " + pound);
        System.out.println("CAD    = " + CAD);
    }
}
