package day21_ForEachLoop;
public class Tasks06_ReturnNumber {
    public static void main(String[] args) {
        String sentence ="Java python c# javascript and other programs you must learn java java pytHON";
        String[] senten = sentence.split(" ");
        int count =0;
        for (String each : senten) {
            if(each.equalsIgnoreCase("java") || each.equalsIgnoreCase("python"))
                count++;
        }
        System.out.println(count);
    }
}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */