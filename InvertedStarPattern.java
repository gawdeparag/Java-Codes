import java.util.Scanner;

class InvertedStarPattern {
    public static void main(String[] args){
        
        System.out.println("Input the number of lines: ");

        Scanner scanner = new Scanner(System.in);

        byte numberOfLines = scanner.nextByte();
        
        for(byte i = 0; i < numberOfLines; i++){
            for(byte j = numberOfLines; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}