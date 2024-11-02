import java.util.Scanner;

public class LongestConsecutiveZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        String binary = Long.toBinaryString(number);

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                count++;
            } else {
                count = 0;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }
}
