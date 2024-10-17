import java.util.*;

class CountOccurencesOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the size of an array: ");
        int sizeOfNumberArray = scanner.nextInt();

        System.out.println("Input the array: ");
        int[] numberArray = new int[sizeOfNumberArray];

        for (int i = 0; i < sizeOfNumberArray; i++) {
            numberArray[i] = scanner.nextInt();
        }

        countFreq(numberArray, numberArray.length);
    }

    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];

        // Filling the visited[] array with boolean value "false"
        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times in this array.");
        }
    }

}