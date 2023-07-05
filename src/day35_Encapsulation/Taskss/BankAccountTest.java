package day35_Encapsulation.Taskss;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount bankAccount1=new BankAccount("kaya",123,120000);
        System.out.println(bankAccount1);
        bankAccount1.deposit(20000);
        bankAccount1.withdraw(30000);

    }
}
