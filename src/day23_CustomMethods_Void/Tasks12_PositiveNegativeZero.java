package day23_CustomMethods_Void;
public class Tasks12_PositiveNegativeZero {
    public static void main(String[] args) {
        posNegZero(5);
    }
    public static void posNegZero(int number){
        if(number>0){
            System.out.println(number+" is a positive.");
        } else if (number<0) {
            System.out.println(number+" is a negative.");
        }else {
            System.out.println(number+" is zero.");
        }
    }
}
// 12. create a method that can if the given integer is positive, negative or zero