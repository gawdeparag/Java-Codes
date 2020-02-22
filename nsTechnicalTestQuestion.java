import java.util.Scanner;

class nsTechnicalTestQuestion{
    public static void main(String[] args){

        System.out.print("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 1; i < number+1; i++){
            for(int j = 1; j < i+1; j++){
                System.out.print(" " + " ");
            }
            for(int k = i; k < number+1; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }

        for(int l = number-1; l > 0; l--){
            for(int m = number-1; m > -1; m--){
                System.out.print(" " + " ");
            }
            for(int p = l; p < number+1; p++){
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}