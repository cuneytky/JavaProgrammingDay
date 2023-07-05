package day23_CustomMethods_Void;
public class Tasks15_Calculator {
    public static void main(String[] args) {
        calculator(5,5,'*');
    }
    public static void calculator(double num1,double num2, char mathOperator){
        double result =0;
        result = mathOperator=='+' ? num1+num2: mathOperator=='-'? num1-num2:
                mathOperator=='*' ? num1*num2:num1/num2;
        System.out.println(""+num1 + mathOperator +num2+" = "+result);
    }
}
// 15. create a method named calculator that passes three arguments
//     (num1, num2, mathOperator), prints the calculation result



