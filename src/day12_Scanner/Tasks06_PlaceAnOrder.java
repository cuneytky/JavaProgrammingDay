package day12_Scanner;
import java.util.Scanner;
public class Tasks06_PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Product Name:");
        String product = input.nextLine();

        System.out.println("enter the quantity:");
        int quantity = input.nextInt();

        System.out.println("enter first name:");
        String name = input.next();

        System.out.println("enter the price:");
        double price = input.nextDouble();

        System.out.println(name+", your order for "+quantity+" "+product+" has been places. Your total is "+price*quantity+".");
    }
}
/*
6. PlaceAnOrder task:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)
        Print in the following format:
          Ex:
              Input: "Apples" , 1.5, 5. "Luke"
         Output:
              Luke, your order for 5 Apples has been places. Your total is 7.5.
 */