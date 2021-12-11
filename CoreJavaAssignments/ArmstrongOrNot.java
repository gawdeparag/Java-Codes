package CoreJavaAssignments;

import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will determine whether a number is Armstrong or not. Please input a number: ");
        int number = scanner.nextInt();
        if (armstrong(number) == true){
            System.out.println("This Number is an Armstrong number!");
        } else {
            System.out.println("This Number is not an Armstrong number!");
        }
    }
    static boolean armstrong(int num){
        int temp = num;
        int sum = 0;
        while (temp != 0){
            int remainder = temp % 10;
            temp = temp / 10;
            sum += remainder*remainder*remainder;
        }
        if (sum == num){
            return true;
        }
        return false;
    }
}
