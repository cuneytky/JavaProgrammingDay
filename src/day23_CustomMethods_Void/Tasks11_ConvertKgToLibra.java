package day23_CustomMethods_Void;
public class Tasks11_ConvertKgToLibra {
    public static void main(String[] args) {
        convertKgLibra(5);
    }
    public static void convertKgLibra(double kg){
        double convert = kg*2.2;
        System.out.println(kg+" kg = "+convert+" libra");
    }
}
// 11. create a method that can convert kg to lb
