package day30_CustomClass;

public class CatObject {
    public static void main(String[] args) {

        Task_Cat taskCat1 = new Task_Cat();

        taskCat1.name= "mınnos";
        taskCat1.breed= "milk";
        taskCat1.age= 4;
        taskCat1.gender='m';
        taskCat1.size="Small";
        taskCat1.color="white";

        Task_Cat taskCat2 = new Task_Cat();

        taskCat2.name= "mın";
        taskCat2.breed= "milk";
        taskCat2.age= 5;
        taskCat2.gender='F';
        taskCat2.size="Middle";
        taskCat2.color="black";

        Task_Cat taskCat3 = new Task_Cat();
        //taskCat3.setInfo("mini","milk","2","small");

        System.out.println(taskCat1);
        System.out.println(taskCat2);
        taskCat1.eat();
        taskCat2.play();









    }
}
