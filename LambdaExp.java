public class LambdaExp {
    public static void main(String[] args) {
        // lambda expression
        Runnable r = () -> System.out.println("Hello, World!");
        r.run();
    }
}