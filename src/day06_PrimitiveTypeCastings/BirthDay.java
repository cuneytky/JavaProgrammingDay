package day06_PrimitiveTypeCastings;

public class BirthDay {
    public static void main(String[] args) {
        String name = "Kaya";
        int birthDay = 5;
        String birthMonth = "March";
        int birthYear = 1990;
        System.out.println("\t"+name+" was born on "+birthMonth+"/"+birthDay+"/"+birthYear);
        System.out.println("------------------------------------------------------");
        String bookName = "Faust";
        System.out.println("\t"+"My favorite book is \""+bookName+"\"");
    }
}
/*
Warmup tasks
	1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)
			 use concatenation to display the birthday of the person
			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;
			 	output:
			 		John was born on April/25/1995.
 */
