import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckAnagrams {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        if (checkAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }

    public static boolean checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Long> freqMap1 = str1.toLowerCase().chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> freqMap2 = str2.toLowerCase().chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return freqMap1.equals(freqMap2);
    }
}
