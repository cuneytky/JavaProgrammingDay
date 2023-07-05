package day39_Recap.task_Animal;

public class AnimalTest {
    public static void main(String[] args) {

        FriendlyAnimal friendlyAnimal =new FriendlyAnimal("cat","yes","red","small",2,'M',false,true,true);

        friendlyAnimal.isFriendly();
        friendlyAnimal.play();
        System.out.println(friendlyAnimal);

        Dog dog= new Dog("poncik", "breed","red","small",1,'F',false,true,true);
        dog.bark();
        System.out.println(dog);

        Crocodile crocodile=new Crocodile("hunter","egg", "green","large",5,'F',true,false,false);
        crocodile.hunt();
        crocodile.drink();
        System.out.println(crocodile.getSize());
        System.out.println(crocodile);


    }
}
