package day22_MultiDimensionalArray;
public class Tasks02_Market_2D {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        for (int i = 0; i < items.length; i++) {
            for (int i1 = 0; i1 < items[i].length; i1++) {
                System.out.print(items[i][i1]+"\t");
            }
            System.out.println();
        }
        System.out.println("=============================");
        for (int i = 0; i < items.length; i++) {
            for (int i1 = items[i].length-1 ; i1 >= 0; i1--) {
                System.out.print(items[i][i1]+"\t");
            }
            System.out.println();
        }
        System.out.println("=============================");
        for (int i = items.length - 1; i >= 0; i--) {
            for (int i1 = 0; i1 < items[i].length; i1++) {
                System.out.print(items[i][i1]+"\t");
            }
            System.out.println();
        }
    }
}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */