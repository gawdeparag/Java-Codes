/* This is the classic example of Method Overriding where
   Where child class inherits a method from it's Parent
   but still overrides it with it's own method with same name as that of 
   previously inherited method from it's Parent */
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