package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1= new BankAccount();
        account1.setInfo("Ahmet oz",123456789);


        System.out.println(account1);//BankAccount{accountHolder='Ahmet oz', accountNumber=123456789, balance=0.0}

        account1.deposit(1000); //balance -= amount; Bankaccount  daki hesapı uygular
        account1.checkBalance();// your avaible balance is: 1000.0

        account1.withdraw(900);
        account1.checkBalance();//your avaible balance is: 100.0

        account1.deposit(900);
        account1.checkBalance();// your avaible balance is: 1000.0

        System.out.println("-------------------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun",987654);
        account2.deposit(10000);
        account2.checkBalance();// your avaible balance is: 10000.0






    }

}
