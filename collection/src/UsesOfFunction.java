import java.lang.reflect.Field;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsesOfFunction {
    public static void main(String[] args) {

        Function<String, Integer> stringToLength = s -> s.length();

        String s = "Hello, This is Parag!";
        s = s.toLowerCase().replaceAll("\\s", "")
                        .replace(",","").replace("!","");

        int length = stringToLength.apply(s);
        System.out.println(length);

        List<String> names = Arrays.asList("John", "Joe", "Mark");
        List<Integer> lengthsOfNames = names.stream().map(stringToLength).collect(Collectors.toList());
        System.out.println(lengthsOfNames);



//        Function in JAVA
        Function<Integer, Integer> square = n -> n * n;
        Function<Integer, String> toString = Objects::toString;
        Function<Integer, String> squareThenToString = square.andThen(toString);
        String result = squareThenToString.apply(5);
        System.out.println(result);

        Function<Integer, Integer> multiplyByTwo = n -> n * 2;
        Function<Integer, Integer> addThree = n -> n + 3;
        Function<Integer, Integer> subtractFour = n -> n - 4;
        Function<Integer, Integer> composedFunction = multiplyByTwo.compose(addThree).andThen(subtractFour);
        int output = composedFunction.apply(5);
        System.out.println(output);


    }
}
