package day17_While_DoWhile;
import java.util.Scanner;
public class Task05_RoomReservation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you want a room?");
        String yesNo =scanner.next();
        while (!(yesNo.equalsIgnoreCase("yes") || yesNo.equalsIgnoreCase("no"))){
            System.out.println("invalid answer, re-enter...");
            yesNo =scanner.next();
        }
        if(yesNo.equalsIgnoreCase("yes")){
            System.out.println("which type of room?");
             String room=scanner.next();
             while (!(room.equalsIgnoreCase("King")||room.equalsIgnoreCase("Queen")||room.equalsIgnoreCase("single"))){
                System.out.println("invalid room, re-enter...");
                room=scanner.next();
            }
            if(room.equalsIgnoreCase("King")){
                System.out.println("King Bed ==> 120$");
            } else if (room.equalsIgnoreCase("Queen")) {
                System.out.println("Queen Bed ==> 100$");
            } else if (room.equalsIgnoreCase("single")) {
                System.out.println("single Bed ==> 80$");
            }
        }else {
            System.out.println("have a nice day:)");
        }
    }
}
/*
 5. Create a class called RommReservation, write a program for the room reservation,
  your program asks the user wants to reserve a room. if user entered yes, then ask
  which type of room the user wants to reserve. if user entered no, print "have a nice day"
  (if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)
	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$
  the program should be able to display the room he/she reserved and total price of the room.
  (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */