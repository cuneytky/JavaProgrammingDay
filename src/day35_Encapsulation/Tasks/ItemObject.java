package day35_Encapsulation.Tasks;

public class ItemObject {
    public static void main(String[] args) {

        Item item=new Item("milk",10,5);
        System.out.println(item);
        Item item1=new Item("mil k",10,5);
        System.out.println(item1);
        Item item2=new Item("*milk",10,5);
        System.out.println(item2);
        Item item3=new Item("milk",-5,5);
        System.out.println(item3);
        Item item4=new Item("milk",10,-5);
        System.out.println(item4);
        Item item5=new Item("toilet paper",10,5);
        System.out.println(item5);



    }
}
