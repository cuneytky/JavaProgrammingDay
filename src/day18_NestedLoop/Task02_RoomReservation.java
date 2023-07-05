package day18_NestedLoop;
import java.util.Scanner;
public class Task02_RoomReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Total=0;
        int day=0;
        while (true) {
            System.out.println("which bedroom do you want to reserve?");
            String room = scanner.next();
            if (room.equalsIgnoreCase("King")) {
                Total += 120;
            } else if (room.equalsIgnoreCase("Queen")) {
                Total += 100;
            } else if (room.equalsIgnoreCase("single")) {
                Total += 80;
            } else {
                System.out.println("invalid entry, re-enter");
                System.out.println("which bedroom do you want to reserve?");
                room = scanner.next();
            }
            System.out.println("How many nights you are staying?");
            int night = scanner.nextInt();
            day+=night;
            System.out.println("would you like to reserve another room?");
            String yesNo = scanner.next();
            if(yesNo.equalsIgnoreCase("no")){
                break;
            }
        }
        int totalPrice = Total*day;
        System.out.println("Total Price: "+ totalPrice);
    }
}
/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
   the program asks the user which bedroom does he/she wants to reserve,
    and how many nights he/she is staying.
   Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price
    If user enters any invalid entry,  ask the user to re-enter
    until user provides a valid entry
 */