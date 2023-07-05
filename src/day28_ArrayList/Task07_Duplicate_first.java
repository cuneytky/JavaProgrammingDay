package day28_ArrayList;
import java.util.ArrayList;
public class Task07_Duplicate_first {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        System.out.println("list = "+list);
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : list) {
            int count =0;
            for (Integer element : list) {
                if(each==element){
                    count++;
                }
            }
            if(count==2){
                System.out.println(each);
                break;
            }
        }
    }
}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */
