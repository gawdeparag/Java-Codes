/* This is the classic example of Method Overriding where
   child class inherits a method from its Parent
   but still overrides it with its own method with same name as that of
   previously inherited method from its Parent */
class OverriddenParentClass{
    void method(){
        System.out.println("Hello from Parent Class!");
    }
}

class MethodOverriding extends OverriddenParentClass{
    void method(){
        System.out.println("Hello from Child Class showing example of method overriding!");
    }

    public static void main(String[] args){
        MethodOverriding methodOverriding = new MethodOverriding();
        methodOverriding.method();
    }
}