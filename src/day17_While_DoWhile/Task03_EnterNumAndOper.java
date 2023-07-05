package day17_While_DoWhile;
import java.util.Scanner;
public class Task03_EnterNumAndOper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter first number:");
        int num1=scanner.nextInt();

        System.out.println("enter second number:");
        int num2=scanner.nextInt();

        System.out.println("enter a operator:");
        String opr=scanner.next();

        int result=0;
        while( !( opr.equals("+")||(opr.equals("-"))||(opr.equals("*"))||(opr.equals("/")) ) ){
            System.out.println("invalid operator! re-enter: ");
            opr=scanner.next();
        }
        if(opr.equals("+")){
            result= num1+num2;
        } else if (opr.equals("-")) {
            result=num1-num2;
        } else if (opr.equals("*")) {
            result=num1*num2;
        } else if (opr.equals("/")) {
            result=num1/num2;
        }
        System.out.println(result);
    }
}
/*  3. write a program to ask user to enter two number and math operator,
 and return the result.
		if the operator is invalid operator, ask user to re-enter
the operator until user provides a valid operator (+, -, *, /)
 */