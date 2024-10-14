import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 25);
        Product floorPanel = new Product("Floor Panel", 38);
        Product window = new Product("Glass Window", 12);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
//        Collections.addAll(products, floorPanel, window);

        Collection<Product> productsToAdd = new ArrayList<>();
        productsToAdd.add(floorPanel);
        productsToAdd.add(window);
        products.addAll(productsToAdd);

//        for(Product product: products) {
//            System.out.println(product.getName());
//        }

//        Iterator<Product> iterator = products.iterator();
//        while(iterator.hasNext()) {
//            Product next = iterator.next();
//            if (next.getNumber() < 20) {
//                iterator.remove();
//            }
//        }
//        for(Product product: products) {
//            System.out.println(product.getName());
//        }



//        Map<String, Integer> map1 = new HashMap<>();
//        Use if you don't want to maintain the insertion order
//        Null keys are allowed
//        Duplicate keys aren't allowed

//        Map<String, Integer> map1 = new LinkedHashMap<>();
//        Use if you want to maintain the insertion order
//        Null keys are allowed
//        Duplicate keys aren't allowed

        Map<String, Integer> map1 = new TreeMap<>();
//        Use if you want the map to be sorted based on the values in Key
//        Null keys aren't allowed in TreeMap<>(); throws NullPointerException
//        Duplicate keys aren't allowed

        map1.put("Ram", 91);
        map1.put("Shyam", 90);
        map1.put("Ghanshyam", 92);
        System.out.println(map1);

        Map<String, Integer> map2 = new Hashtable<>();
        map2.put("Yogi", 22);
        map2.put("Rogi", 20);
        map2.put("Bhogi", 21);
        map2.put("Sodhi", 23);
        System.out.println(map2);
//        Null keys & values aren't allowed in Hashtable<>(); throws NullPointerException
//        Does not maintain any order of keys or values; entries aren't stored in any particular order



//        Set<String> set1 = new HashSet<>();
//        Insertion order is not maintained
//        Null values allowed
//        Duplicates not allowed

        Set<String> set1 = new LinkedHashSet<>();
//        Insertion order is maintained
//        Null values allowed
//        Duplicates not allowed

//        Set<String> set1 = new TreeSet<>();
//        Gives sorted data
//        Duplicates not allowed
//        Null values not allowed; throws NullPointerException

        set1.add("Narender");
        set1.add("Yoginder");
        set1.add("Joginder");
        System.out.println(set1);



//        List<String> list1 = new LinkedList<>();
//        Insertion Order is maintained; Allows null values and duplicate values
//        Uses Doubly-linked List as underlying Data structure

        List<String> list1 = new ArrayList<>();
//        Insertion order is maintained; Allows null and duplicate values
//        Uses Dynamic array as underlying data structure

        list1.add("Ramesh");
        list1.add("Suresh");
        list1.add("Mayuresh");
        System.out.println(list1);

        Stack<String> stack1 = new Stack<>();
        System.out.println(stack1.add("Arun"));
        stack1.push("Varun");
        System.out.println(stack1.peek());
        stack1.pop();
        System.out.println(stack1);

        Vector<String> vector1 = new Vector<>();
        System.out.println(vector1.capacity());

        vector1.add("Bob");
        vector1.add("Snob");
        vector1.add("Knob");

        vector1.ensureCapacity(11); // Adjusting capacity of vector manually
        System.out.println(vector1.capacity());

        System.out.println(vector1);



        FunctionalInterfaceOne func = () -> System.out.println("Lambda expression in action");
        func.execute();
        func.display();
        func.staticMethod();



        List<Integer> listOfNumbers = Arrays.asList(30, 10, 20, 5, 7);
        Optional<Integer> result = listOfNumbers.stream().reduce((i, j)-> i*j);
        System.out.println(result);



        Map<Integer, String> students = new HashMap<>();
        students.put(1, "John");
        students.put(2, "Joe");
        students.forEach((x, y) -> System.out.println(x + ": " + y));



        int arr[] = {10, 324, 45, 90, 9809};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);


//        int[] numbers = {10, 30, 20, 5, 7};
//        OptionalInt output = Arrays.stream(numbers).reduce((i, j) -> i*j);
//        System.out.println(output);

    }
}