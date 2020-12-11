import java.util.*;

class SmallestVowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String s = scan.nextLine();
        int l = s.length();
        char[] charArray = new char[l];
        int i = 0;
        
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    charArray[i] = ch;
                    i++;
            }
        }
        int[] asciiValues = new int[l];
        int j = 0;
        for (char ch : charArray) {
            int ascii = (int) ch;
            asciiValues[j] = ascii;
            j++;
        }
        asciiValues = removeElements(asciiValues, 0);
        System.out.println("Smallest Vowel in the string: " + (char) getMin(asciiValues));
    }

    // Function for removing all occurences of a specific element in an array
    public static int[] removeElements(int[] arr, int key) {
        int index = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != key)
                arr[index++] = arr[i];
        // Create a copy of arr[] of length of index
        return Arrays.copyOf(arr, index);
    }

    // Getting minimum value from array
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for (int i : inputArray){
            if(i > minValue){
                minValue = i;
            }
        }
        return minValue;
    }

}