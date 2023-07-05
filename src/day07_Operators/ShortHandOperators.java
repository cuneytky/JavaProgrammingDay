package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        //________________  assignment: =   _______________
        int number = 100;
        System.out.println("number = " + number); //100
        number =200;
        System.out.println("number = " + number); //200

        String word = "Java Prog";
        System.out.println("word = " + word); // Java Prog
        word = "wooden spoon";
        System.out.println("word = " + word); //wooden spoon
        word = "Cydeo";
        System.out.println("word = " + word); // Cydeo
        //word = 123__olmaz int
        word ="123" + 1;
        System.out.println("word = " + word); // 1231
        word = "Java Prg";
        System.out.println("word = " + word); // Java Prg

        System.out.println("...........................");
        //________________  addition assignment: =   _______________
        int x= 100;
        System.out.println("x = " + x); //100
        System.out.println(x+ 200); // 300
        // x = x+200
         x += 200;
        System.out.println("x = " + x); //300

        String str = "wooden";
        str += " spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1); // 2.5
        num1 += 5.5;
        System.out.println("num1 = " + num1); //8.0

        double availableBalance = 1000.50;
        // deposit 300$
        availableBalance += 300; //availableBalance = 1000.50 + 300
        System.out.println("availableBalance = " + availableBalance); //1300.50

        System.out.println("...........................");
        // withdrawing 500$
        availableBalance -= 500; // availableBalance=1000.5-500
        System.out.println("availableBalance = " + availableBalance);//800.5
        // withdrawing 200$, then depositing 400$
        availableBalance -= 200; // 600.5
        availableBalance += 400; // 1000.5
        System.out.println("availableBalance = " + availableBalance);// 1000.5
        
        System.out.println("...........................");
        
        double salary = 50000.50;
        System.out.println("salary = " + salary);// 50_000.5
        salary *= 2;
        System.out.println("salary = " + salary); // 100_001.0

        double doge = 0.00000001;
        doge *= 1_000_000;
        System.out.println("doge = " + doge); //0.01

        System.out.println("...........................");

        double num2 = 25000;
        //num2 = num2/2;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("...........................");

        double num3 = 100;
        // %=
        num3 %= 3; //1
        System.out.println("num3 = " + num3);

        System.out.println("...........................");

        int amount =127; // cents
        int quarters = amount/25;
        int cents = amount % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        int y = 300;
        y %= 16;
        System.out.println("y = " + y); //12

        int balance = 3500;
        // insurance fee: $153
        balance %= 153;
        System.out.println("balance = " + balance);


        


        //________________  addition assignment: =   _______________





    }
}
