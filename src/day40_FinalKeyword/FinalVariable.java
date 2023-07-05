package day40_FinalKeyword;
public class FinalVariable {
    final String birthDay;     //==> yalnız boyle kullanamazsın ama constructor ile kullanınca sorun cıkmaz
    final static String name;  //==> yalnız boyle kullanamazsın ama

    static{
        name = "Batch 25";    // ==> statık oldugundan statık yontemle tanımlayınca kullanabılırsın.
    }
    // statık değiştıırlebılır ama fınal değiştırılemez (never)

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;                  // burada bırtday tanımlanmıs oldu.....
    }

    public final static void main(String[] args) {
        final double pi = 3.14;    //pi = 4.14; final variables can not be reassigned

        final String name;        // yalnızca bır kez atanabılır.... final ıle olusturduğumuz ıcın
        name = "Java";            //   name = "Wooden Spoon";
        System.out.println(name); // Java

        System.out.println("----------------------------------------");

        FinalVariable obj = new FinalVariable("May/01");
        //obj.birthDay = "June/01"; // final variables can not be reassigned
        System.out.println(obj.birthDay);   // May/01

        System.out.println("----------------------------------------");

        //  FinalVariable.name = "Python"; // final oldugundan değişmedi ama final olmasa idi
                                           // sadce statıc olsa odo degısırdı.

        System.out.println(FinalVariable.name);// Batch 25

        // class fınal olursa extend ile bağlanamaz. orneğin: ıphone facetime özelligi var samsunga parent yapılamaz
    }
}
