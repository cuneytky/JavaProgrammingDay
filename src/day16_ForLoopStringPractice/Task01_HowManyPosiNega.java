package day16_ForLoopStringPractice;
import java.util.Scanner;
public class Task01_HowManyPosiNega {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int pos=0;
        int neg=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number:");
            int num=scanner.nextInt();
            if(num>0){
                pos+=1;
            }else if (num<0){
                neg+=1;
            }
        }
        System.out.println(pos+" positive and "+neg+" negative");
    }
}
/*
1. Write a program that asks user to enter number for 5 times, and
    print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3
				Output:
					3 positive and 1 negative
 */