package day34_GarbageCollection_AccessModifiers;
public class StaticMembers {
    int a;
    class class1{
    }
   // variable=> static
    public static int num = 100;
   // mthod=> static
    public static void method(){
    }
    // blok =>static
    static{
    }
}
class A { // outer class
    static class B { // inner class
        // 1 pre-condition make static class has to be nestedclass
            // static class always inner(outer olmaz)
        public static void method1(){
        }
    }
}
class C{
    public static void main(String[] args) {
        A.B.method1(); // sırayla cagırdık (yukarıdaki clasları)
    }
}
class X{
}
class Y{
}
class Z{
    static class Q{
    }
}



