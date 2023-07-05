package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            if(i==3){
                break; // terminates the loop
            }
            System.out.println(i);
        }
        System.out.println("wooden");

        System.out.println("=========================");

        for (int i = 0; i <5 ; i++) {
            if(i==3){
                continue; // terminates the current iteration of loop
            }
            System.out.println(i);
        }
        System.out.println("wooden");

        System.out.println("==========================");

        for (int i = 0; i <5 ; i++) {
            if(i==3){
             System.exit(0); // terminates the program
            }
            System.out.println(i);
        }
        System.out.println("wooden");

        System.out.println("==========================");




    }
}
