package day17_While_DoWhile;
import java.util.Scanner;
public class task06_InsuranceQuote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name:");
        String name=scanner.nextLine();
        double total=0;
        double discount =0;
        double extracharge =0;
        System.out.println("enter your gender:");
        char gender =scanner.next().charAt(0);
        while (!(gender=='M'||gender=='F'||gender=='m'||gender=='f')){
            System.out.println("invalid entry, re-enter...");
            gender =scanner.next().charAt(0);
        }
        System.out.println("are you married(yes/no)");
        String married= scanner.next();
        while (!(married.equalsIgnoreCase("yes") || married.equalsIgnoreCase("no") ) ){
            System.out.println("invalid entry, re-enter...");
            married= scanner.next();
        }
        if(married.equalsIgnoreCase("yes")){
            discount+=0.05;
        }
        System.out.println("enter age:");
        int age = scanner.nextInt();
        while ( (age<0 || age>120) ){
            System.out.println("invalid entry, re-enter...");
            age = scanner.nextInt();
        }
        if(age<25){
            total+=90;
        } else if (age>=25) {
            total+=50;
        }
        System.out.println("enter how many miles drive in a day");
        int mile =scanner.nextInt();
        while ( mile<5 || mile<0 ){
            System.out.println("invalid entry, re-enter...");
            mile =scanner.nextInt();
        }
        if(mile<=10){
            total+=10;
        } else if (mile>10 || mile<=50) {
            total+=30;
        } else if (mile>50) {
            total+=50;
        }
        System.out.println(" do you want full coverage or liability insurance?");
        String full = scanner.next();
        if ( full.equalsIgnoreCase("yes")){
            if(age<25){
                total+=160;
            } else if (age>=25) {
                total+=120;
            }
            if(mile<=10){
                total+=20;
            } else if (mile>10 || mile<=50) {
                total+=40;
            } else if (mile>50) {
                total+=70;
            }
        }
        System.out.println("had you any accidents or claims in past 5 years (Yes/No)?");
        String accident =scanner.next();
        while (!(accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no") ) ){
            System.out.println("invalid entry, re-enter...");
            accident= scanner.next();
        }
        if(accident.equalsIgnoreCase("yes")){
            extracharge+= 0.15;
        }
        if(accident.equalsIgnoreCase("no")){
            discount+=0.10;
        }
        System.out.println("you car has an anti-theft device (Yes/No");
        String device = scanner.next();
        while (!(device.equalsIgnoreCase("yes") || device.equalsIgnoreCase("no") ) ){
            System.out.println("invalid entry, re-enter...");
            device= scanner.next();
        }
        if(device.equalsIgnoreCase("yes")){
            discount+= 0.05;
        }
        double discount1= total*discount;
        double extracharge1 = total*extracharge;
        double totalPrice=total + extracharge1 - discount1;
        System.out.println("total = " + total);
        System.out.println("discount1 = " + discount1);
        System.out.println("extracharge1 = " + extracharge1);
        System.out.println("totalPrice = " + totalPrice);
    }
}
/*
  6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		++1. Ask the user to enter your name
    		++2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			++3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			++4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			++5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			++6. Ask the user if he/she wants full coverage or liability insurance?

			++7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			++8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70

			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount

 */