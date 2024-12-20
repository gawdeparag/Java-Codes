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
            System.out.println("Input the Second number: ");
            double numberTwo = scanner.nextDouble();

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
                    // If you divide a floating-point number by zero (like 25.0 / 0),
                    // Java allows it and will return positive infinity (Infinity) as a result,
                    // Which is what exactly will happen in this particular case.
                    System.out.println(numberOne+" / "+numberTwo+" = "+(numberOne/numberTwo));
                    break;
                case 5:
                    // In the case of floating-point numbers, if you try 25.0 % 0.0,
                    // the result will be NaN (Not a Number) because
                    // modulus by zero for floating-point numbers is undefined,
                    // which is what exactly will happen in this particular case.
                    System.out.println(numberOne+" % "+numberTwo+" = "+(numberOne%numberTwo));
                    break;
                default:
                    System.out.println("Please select a valid option!");
                    break;
            }
        }
    }
}