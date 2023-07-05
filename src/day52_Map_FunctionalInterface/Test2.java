package day52_Map_FunctionalInterface;

public class Test2 {
    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach = s -> {  // <> buradaki String değil hepsi olabilir
            for (String each : s.split("")) {          // Integer [] array...
                System.out.println(each);
            }
        };

        printEach.test("Wooden Spoon");

       //  burada Integer tanımlandı  <  >
        MySecondFunctionalInterface<Integer> cube = n -> System.out.println(n*n*n);

        cube.test(5); // 125


    }
}
