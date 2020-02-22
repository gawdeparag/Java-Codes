import java.util.Scanner;

class Calculator {
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
            double numberOne = scanner.nextDouble();
            System.out.println("Input the First number: ");
            double numberTwo = scanner.nextDouble();

            if(option == 1){
                System.out.println(numberOne+" + "+numberTwo+" = "+(numberOne+numberTwo));
            } else if(option == 2){
                System.out.println(numberOne+" - "+numberTwo+" = "+(numberOne-numberTwo));
            } else if(option == 3){
                System.out.println(numberOne+" * "+numberTwo+" = "+(numberOne*numberTwo));
            } else if(option == 4){
                System.out.println(numberOne+" / "+numberTwo+" = "+(numberOne/numberTwo));
            } else if(option == 5){
                System.out.println(numberOne+" % "+numberTwo+" = "+(numberOne%numberTwo));
            } else{
                System.out.println("Please select a valid option!");
            }
        }
    }
}