package day33_Statics.Tasks;

public class T06_DogObject {
    public static void main(String[] args) {

        T06_Dog t06Dog1= new T06_Dog("Hesky","white",'L',5,'F');
        System.out.println(t06Dog1);
        t06Dog1.eat();
        t06Dog1.play();
        t06Dog1.sleep();


    }
}
