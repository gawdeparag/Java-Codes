import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurences {
    public static void main(String[] args) {
        String input = "Hello This is Parag";

        Map<Character, Long> letterCount = input.toLowerCase()
                                            .replaceAll("\\s", "")
                .chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        letterCount.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
