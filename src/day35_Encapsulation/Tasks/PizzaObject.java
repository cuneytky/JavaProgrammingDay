package day35_Encapsulation.Tasks;

public class PizzaObject {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("large", 1, 2);
        System.out.println(pizza);
        Pizza pizza1= new Pizza("small",4,5);
        System.out.println(pizza1);
        Pizza pizza2= new Pizza("medium",3,4);
        System.out.println(pizza2);
       Pizza pizza3= new Pizza(null,3,4);
       System.out.println(pizza3);




    }
}
