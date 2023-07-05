package day35_Encapsulation;
public class TaskClass_CircleObject {
    public static void main(String[] args) {
        TaskClass_Circle circle1= new TaskClass_Circle(5);
        System.out.println(circle1); //TaskClass_Circle{radius=5.0}
        circle1.calcArea();         // 78.5
        circle1.calcPerimeter();    //31.400000000000002
        System.out.println("=========");
    }
}
