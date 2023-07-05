package day36_Inheritance.Task_Book;
public class MyBook {
    public static void main(String[] args) {

        EBook book= new EBook();
        book.setInfo("Story","Love","Adams",150,"A5",180);
        System.out.println(book);

        AudiBook audiBook= new AudiBook();
        audiBook.setInfo("noval","detective","Aghata",140,"45mb","Cydeo");
        System.out.println(audiBook);

    }
}
