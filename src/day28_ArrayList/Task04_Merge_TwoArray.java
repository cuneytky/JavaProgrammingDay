package day28_ArrayList;
import java.util.ArrayList;
public class Task04_Merge_TwoArray {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        System.out.println(arr1);
        ArrayList<String> arr2 =new ArrayList<>();
        arr2.add("D");
        arr2.add("E");
        arr2.add("F");
        arr2.add("G");
        System.out.println(arr2);
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr1) {
            list.add(s);
        }
        for (String s : arr2) {
            list.add(s);
        }
        System.out.println(list);
    }
}
/*

4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
