package day15_ForLoop;
public class Tasks07_ReverseString {
    public static void main(String[] args) {
        String str ="Wooden Spoon";
        String yeni="";
        for (int i = str.length()-1; i >=0 ; i--) {
        yeni+= str.charAt(i);
        }
        System.out.println(yeni);
    }
}
/*7. Write a program that can reverse any given string
			Ex:
				input:
					Wooden Spoon
				output:
					noopS nedooW
 */