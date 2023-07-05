package day06_PrimitiveTypeCastings;
public class PrimitiveCastings {
    public static void main(String[] args) {
        byte  a = 100;
        short b = a;
        //short b =  (short)a;
        //         (short)a

        int c = b; // implicit casting
        // int c = (int)b

        long d = c ;
        //      (long)c

        float e = d;
        double f = e;

        System.out.println("------------------------------");

        int x = 55;
        short y = (short)x; // explicit casting
        System.out.println(x + " : " + y);   // 55 : 55

        long j = 1000000;
        short k =  (short)j;
        System.out.println(j+" : "+k);  //1000000 : 16960

        double l = 2.5;
        float m =  (float)l;
        System.out.println(l + " : "+m); //2.5 : 2.5

        double n = 10.8;
        int s = (int)n; // 10
        System.out.println(n + " : "+s);  //10.8 : 10

        System.out.println("------------------------------");

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1 +" : "+s1); //20.5 : 20

        double d2 = 15.2;
        short s2 = (short) d2;

        float f1 = 30.5F;
        long l1 = (long) f1;

    }
}
