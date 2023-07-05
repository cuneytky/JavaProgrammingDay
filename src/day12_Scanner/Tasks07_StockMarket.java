package day12_Scanner;
import java.util.Scanner;
public class Tasks07_StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many total shares?");
        int share = input.nextInt();
        if(share<0){
            System.out.println("invalid number");
        }
        if(share>0){
            System.out.println("how much their total value in the stock market?");
            double totalValue = input.nextDouble();
            input.nextLine();
            System.out.println("enter the name of the company:");
            String company = input.nextLine();
            System.out.println("Your total stock market holding is "+totalValue+" which is made up of "+share+" shares. "+company+" is your company holdings");
        }
    }
}
/*
7. StockMarket task:
     - Ask the user how many total shares they have already? (int)
       -> If the user gives 0 or give a negative number none of the rest condition should be executed
     - Ask the user how much their total value in the stock market is (double)
     - Ask the user to enter the name of the company they have the most shares in (String, multiple words)
     - Print in the following format:
         Ex:
            inputs: 100, 25000, Apple INC
   "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */