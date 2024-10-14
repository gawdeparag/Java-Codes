package CoreJavaAssignments;

import java.util.Scanner;

public class InterestsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the Principal Amount: ");
        int principal = scanner.nextInt();
        System.out.print("Input the Time Period in years: ");
        int years = scanner.nextInt();
        System.out.print("Input the Rate of Interest: ");
        int interestRate = scanner.nextInt();
        System.out.println("The Simple Interest is: "+simpleInterest(principal, years, interestRate));
        System.out.println("The Compound Interest is: "+compoundInterest(principal, years, interestRate));
    }
    static double simpleInterest(int principal, int years, int interestRate){
        double interest = 0;
        interest = (principal*years*interestRate)/100;
        return interest;
    }
    static double compoundInterest(int principal, int years, int interestRate){
        double interest = 0;
        interest = Math.pow(principal*(1+(interestRate/100)), years);
        return interest;
    }
}
