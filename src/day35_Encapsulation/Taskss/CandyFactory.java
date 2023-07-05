package day35_Encapsulation.Taskss;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        Candy candy1 = new Candy("milky",10,-10,true);
        Candy candy2 = new Candy("eti",5,0,false);
        Candy candy3 = new Candy("ulker",-20,20,true);
        Candy candy4 = new Candy("saray",30,30,true);
        Candy candy5 = new Candy("crack",40,25,false);

        ArrayList<Candy> candyArrayList =new ArrayList<>();
        candyArrayList.addAll (Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy candy : candyArrayList) {
            System.out.println(candy.getBrand()+" : "+ candy.getPrice());
        }
    }
}
