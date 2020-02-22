class MethodOverriding{
    public static void main(String[] args){
        ChildClass.method();
    }
}

/* This is the classic example of Method Overriding where
   Where child class inherits a method from it's Parent
   but still overrides it with it's own method with same name as that of 
   previously inherited method from it's Parent */
class ParentClass{
    public static void method(){
        System.out.println("Hello from Parent Class!");
    }
}

class ChildClass extends ParentClass{
    public void childMethod(){
        System.out.println("This is Child's own method!");
    }
    public static void method(){
        System.out.println("Hello from Child Class showing example of method overriding!");
    }
}