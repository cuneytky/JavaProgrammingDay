package day35_Encapsulation.Tasks;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(10,5,true,100);
        System.out.println(carpet);
        Carpet carpet1 = new Carpet(10,5,false,100);
        System.out.println(carpet1);
        System.out.println(carpet1.calcCost());

    }

}
