package day19_LoopPractices;

public class LoopsWithoutCurlyBraces {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++)
            System.out.println("cydeo");// only one statement no curly braces


        for (int i = 0; i < 5; i++)
            System.out.println("Java");// only one statement no curly braces


        for (int i = 0; i < 5; i++)      //!!!!!!!!!
            System.out.println("cydeo");
            System.out.println("Java");
                                     // only firts 5 times study !!!


        for (int i = 0; i < 5; i++) {
            System.out.println("cydeo");
            System.out.println("Java");// two statement must curly braces
        }




    }
}
