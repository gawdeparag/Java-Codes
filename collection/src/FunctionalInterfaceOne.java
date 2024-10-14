@FunctionalInterface
public interface FunctionalInterfaceOne {
    void execute();

    default void display() {
        System.out.println("Default method in functional interface");
    }

    default void staticMethod() {
        System.out.println("Static method in functional interface");
    }
}
