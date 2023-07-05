package day35_Encapsulation.Taskss;

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        if(accountNumber<0){
            System.out.println("account Number not negative");
            return;
        }
        this.accountNumber = accountNumber;
    }
    // this not use??? change the balance!!!

    public void setBalance(double balance) {
        this.balance = balance;
    }



    public void deposit(double count){
        if(count<=0){
            System.err.println("deposit count can not negative or zero");
            return;
        }
        balance += count;
        System.out.println("deposit : "+ count+" account Number : "+accountNumber+" balance: "+balance);

    }

    public void withdraw(double count1){
        if(count1<=0){
            System.err.println("withdrawing count can not be negative or zero");
            return;
        }
        if(balance<=0){
            System.out.println("insufficient balance");
            return;
        }
        balance -= count1;
        System.out.println("withdraw : "+ count1+" account Number : "+accountNumber+" balance: "+balance);

    }
    /*
    public void checkBalance(){    }    // It's not necessary. we have already done
     */

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
/*
3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments
 */