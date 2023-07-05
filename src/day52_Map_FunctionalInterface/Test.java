package day52_Map_FunctionalInterface;
// lambda:  () -> {}   ==> syntex " sadece 1 deger(n) verdıysek parantez koymayabiliriz. ama alış ve koy
                        // 2 olunca hata verir
                        // {} --> sadece tek satırsa bunu da koymayabılısın. 3. ornekte kullanmadık. diğerleinde hata verir
public class Test {
    public static void main(String[] args) {

// function1: create a function that can display a number is odd or even
        MyFirstFunctionalInterface  oddOrEvenNumber =  (n) -> {
            if(n%2==0){
                System.out.println(n + " is even number");
            }else{
                System.out.println(n+" is odd number");
            }
        };
        oddOrEvenNumber.apply(20); // 20 is even number

 System.out.println("------------------------------");

// function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol;

        eligibleToBuyAlcohol = (age) -> {
            if(age >= 21){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol");
            }
        };

        eligibleToBuyAlcohol.apply(18); // Not eligible to buy alcohol

 System.out.println("------------------------------");

//function3: create a function that can display the cube of a number

        MyFirstFunctionalInterface printCube;

        printCube = n ->  System.out.println(n*n*n); ;

        printCube.apply(3); // 27

 System.out.println("------------------------------");

 //function4: create a function that can check if a number is evenly divisble by  3 & 5

        MyFirstFunctionalInterface divisibleBy3And5 =  n -> {
            if(n % 15 ==0){
                System.out.println(n+" is divisible by 3 and 5");
            }else{
                System.out.println(n+" is not divisible by 3 and 5");
            }
        };
        divisibleBy3And5.apply(30); //30 is divisible by 3 and 5

    }
}
