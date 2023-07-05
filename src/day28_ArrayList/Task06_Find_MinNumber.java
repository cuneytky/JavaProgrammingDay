package day28_ArrayList;
import java.util.ArrayList;
public class Task06_Find_MinNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("list = "+list);
        int min=2147483647;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<min){
                min = list.get(i);
            }
        }
        System.out.println(min);
    }
}
/*
6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */
