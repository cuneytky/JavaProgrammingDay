package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args){

        int num1 = 25;
        int num2 = -25;

        System.out.println(num1 < 0);// false
        System.out.println(num2 < 0);// true
        System.out.println("-------------------");

        int a=5;
        ++a; // pre increment: increases the value by 1 right away
        System.out.println(a); // 6

        --a; //pre decrement: decrease the value by 1 right away
        System.out.println(a); //5

        System.out.println("-------------------");

        int b = 100;
        System.out.println("b= "+ ++b); //101__pre increment: increase value hemen(öncelikle)

        int c= 100;
        System.out.println("c= "+ c++); //100__ post increment: first passes the current value, then increases the value by 1
        System.out.println("c= " + c); //101  (2 adım da artırdık -2 islem) 2 step

        System.out.println("-------------------");

        int x = 200;
        System.out.println("x= "+ --x); //199__pre increment: decreases tha value right away

        int y = 200;
        System.out.println("y= "+ y--); //200__post increment: first passes the current value
        System.out.println("y="+ y ); // 199__ 2 step --önce pas geciyor sonra 1 dusurur

        int k = 25;
        System.out.println(k++);//25
        System.out.println(k--);//26
        System.out.println(k);//25

        int z = 45;
        System.out.println( ++z ); // 46, z=46
        System.out.println( z++ ); // 46, z=47
        System.out.println( z   ); // 47

        int q = 30;
        System.out.println(--q); // 29, q=29
        System.out.println(q--); // 29, q=28
        System.out.println(q);        // 28

        int m=4;
        System.out.println(++m*2 - m++); //5

        int n=1;
        System.out.println(-n-- + n++/-n--*--n);  // -1

        int v=2;
        System.out.println(++v == 2 || --v==2 && --v ==2); // false









    }
}
