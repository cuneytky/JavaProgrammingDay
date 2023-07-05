package tester;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int [] a={0,1,2,3,5,0,4,0,7,0,11,0};

        int [] b= new int[a.length];

        int x=0;
        for (int i = 0; i < a.length; i++) {
            if( a[i] !=0 ){
                b[x++]= a[i];
            }
        }
        System.out.println(Arrays.toString(b));


    }
}
/*
  write a program that can move all the zeros to the end of an array
    for ex:
    int [] a={0,1,2,3,5,0,4,0,7,0,11,0};
    output: [1, 2, 3, 5, 4, 7, 11, 0, 0, 0, 0, 0]
 */