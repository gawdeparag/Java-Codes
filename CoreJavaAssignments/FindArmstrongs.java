package CoreJavaAssignments;

public class FindArmstrongs {
    public static void main(String[] args) {
        System.out.println("This program will print Armstrong numbers between 100-999.");
        for (int i=100; i<1000; i++){
            if (armstrong(i) != 0){
                System.out.println(i);
            }
        }
    }
    static int armstrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0){
            int remainder = temp % 10;
            temp = temp / 10;
            sum += remainder*remainder*remainder;
        }
        if (sum == num){
            return num;
        } else{
            return 0;
        }
    }
}
