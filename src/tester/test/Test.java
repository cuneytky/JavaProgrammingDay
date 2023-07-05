package tester.test;

interface A{
    void read();
    abstract void watch();
}
abstract class B implements A{
    public void read(){
        System.out.println("reading");
    }
}


public class Test {


}

