package day10_NestedIf;
public class Tasks06_Loans {
    public static void main(String[] args) {
        double salary=75_000;
        double creditScore = 550;
        System.out.println((salary>=60_000&&creditScore>=650)?"loan Approved":"Loan Denied");
    }
}
/*
6. Create a class called Loans, Given two variables salary and credit score,
    use those given info to determine if you can get a loan.
                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise, print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */
