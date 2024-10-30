package collection.src;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsesOfCollectors {
    public static void main(String[] args) {
        List<String> listOfFruits = Stream.of("Apple", "Banana", "Orange").collect(Collectors.toList());
        System.out.println(listOfFruits);

        Map<Integer, String> mapOfPlaces = Stream.of("Mumbai", "Delhi", "Chennai")
                .collect(Collectors.toMap(String::length, k -> k));
        System.out.println(mapOfPlaces);

        String fruitsInASentence = Stream.of("Apple", "Banana", "Orange").collect(Collectors.joining(", "));
        System.out.println(fruitsInASentence);

        Map<Boolean, List<String>> partitioned = Stream.of("Tom", "Tin", "Paul")
                .collect(Collectors.partitioningBy(j -> j.length() > 3));
        System.out.println(partitioned);

        long count = Stream.of("Mumbai", "Delhi", "Chennai").collect(Collectors.counting());
        System.out.println(count);
    }
}
