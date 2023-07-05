package day33_Statics.Tasks;

public class T03_PersonObject {
    public static void main(String[] args) {

        T03_Person person1=new T03_Person("lucas",25,'m');
        T03_Person person2= new T03_Person("Elif",32,'F');
        System.out.println(person1);
        System.out.println(person1.eat());

        System.out.println(person2);
        System.out.println(person2.drink());
        person2.sleep();
    }
}
