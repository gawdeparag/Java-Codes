import java.util.LinkedHashSet;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {
        // Remove repetitive chars from input string and print it as a string.
        String str = "Hello world";
        char[] arr = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (char ch: str.toCharArray()) {
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch: set) {
            sb.append(ch);
        }
        System.out.println(sb.toString());

        // XOR method of swapping without using third variable: works best with int, long, short.
        int a = 20;
        int b = 30;
        System.out.println("Before swap, a: "+a+", b: "+b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("After swap, a: "+a+", b: "+b);

        // Arithmetic swapping method without using third variable: works best with int, float, double.
        long c = 40;
        long d = 50;
        System.out.println("Before swap, c: "+c+", d: "+d);
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println("After swap, c: "+c+", d: "+d);

        // String swapping
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("Before swap, s1: "+s1+", s2: "+s2);
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("After swap, s1: "+s1+", s2: "+s2);
    }
}
