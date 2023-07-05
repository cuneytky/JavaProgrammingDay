package day15_ForLoop;
public class Tasks02_SumOfOdd {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i <101 ; i++) {
            if(i%2==1){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
/*
2. Write a program that can return the sum of odd numbers between 1 to 100
 */