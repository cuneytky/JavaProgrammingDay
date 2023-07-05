package day11_SwitchScanner;
public class NumberToWord {
    public static void main(String[] args) {

        int num = 10;
        String result ="";

            switch (num){
                case 1:
                    result="one";
                    break;
                case 2:
                    result="two";
                    break;
                case 3:
                    result="three";
                    break;
                case 4:
                    result="four";
                    break;
                case 5:
                    result="five";
                    break;
                case 6:
                    result="six";
                    break;
                case 7:
                    result="seven";
                    break;
                case 8:
                    result="eight";
                    break;
                case 9:
                    result="nine";
                    break;
                default:
                    result="invalid";
            }
        System.out.println(result);
    }
}
/*
Task:
	1. NameOfMonth  (1~12)
	2. NumberToWord (0~9)
 */