package day20_Arrays;
import java.util.Scanner;
public class TaskLess_Items {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] item =new String[5];
        int [] itemPrice = new int[5];
        String list = "";
        int TotalPrice =0;
        for (int i = 0; i < item.length; i++) {
            System.out.println("enter item name:");
            item[i]= scanner.next();
            System.out.println("enter item price:");
            itemPrice[i]= scanner.nextInt();
            list += item[i] +" -- "+ itemPrice[i]+"\n";
            TotalPrice+=itemPrice[i];
        }
        System.out.println("ItemName -- Price");
        System.out.println(list);
        System.out.println("TotalPrice = " + TotalPrice);
    }
}
/*
5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines
						ItemName -- Price
 */