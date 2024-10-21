import java.util.Scanner;

public class IntCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Quit");

            System.out.println("Select your option: ");
            byte option = scanner.nextByte();

            if(option == 6){
                System.out.println("Calculator Quitting!");
                break;
            }

            System.out.println("Input the First number: ");
            int numberOne = scanner.nextInt();
            System.out.println("Input the Second number: ");
            int numberTwo = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println(numberOne+" + "+numberTwo+" = "+(numberOne+numberTwo));
                    break;
                case 2:
                    System.out.println(numberOne+" - "+numberTwo+" = "+(numberOne-numberTwo));
                    break;
                case 3:
                    System.out.println(numberOne+" * "+numberTwo+" = "+(numberOne*numberTwo));
                    break;
                case 4:
                    try {
                        System.out.println(numberOne+" / "+numberTwo+" = "+(numberOne/numberTwo));
                    } catch (ArithmeticException e) {
                        System.out.println("Exception occurred: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.println(numberOne+" % "+numberTwo+" = "+(numberOne%numberTwo));
                    } catch (ArithmeticException e) {
                        System.out.println("Exception occurred: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Please select a valid option!");
                    break;
            }
        }
    }
}
