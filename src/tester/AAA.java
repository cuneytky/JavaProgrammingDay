package tester;

import java.util.ArrayList;
import java.util.Arrays;
public class AAA {
    public static void main(String[] args) {




        
    }
}

/*
Q-1
    write a program that can move all the zeros to the end of an array
    for ex:
    int [] a={0,1,2,3,5,0,4,0,7,0,11,0};
    output: [1, 2, 3, 5, 4, 7, 11, 0, 0, 0, 0, 0]
======================================
          solution: 
        int [] a={0,1,2,3,5,0,4,0,7,0,11,0};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a)); //[0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 7, 11]

        int [] b= new int[a.length];
        for (int i = 0, x=0; i < a.length; i++) {
            if(a[i]!=0){
                b [x++]=a[i];
            }
        }
        System.out.println(Arrays.toString(b)); //[1, 2, 3, 4, 5, 7, 11, 0, 0, 0, 0, 0]

**************************************************
        
     
Q-2
/
    Write a return method that returns the factorial number of any given number

        Ex:     Input: 5
                outPut: 120 -->  because 5 * 4 * 3 * 2 * 1 = 120
==================================
        solution:
        int result=1;
        for (int i = 1; i <6 ; i++) {
            result*=i;
        }
        System.out.println(result);
     /
 ************************************************************
Q-3
/
    Write a function that can remove the duplicates from an array of integers
=================== 
    solution: 
      int [] a={0,1,2,3,4,0,0};
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if( !list.contains(a[i])){
                    list.add(a[i]);
            }
        }
        System.out.println(list);    
 */