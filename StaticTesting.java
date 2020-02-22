class StaticTesting{
    public static void main(String[] args){
        
        ParentClass parentClass = new ChildClass();
        parentClass.method();
        parentClass.variableStatic = 12;
        System.out.println(parentClass.variableStatic);
        
    }
}
class ParentClass{

    public final void method(){
        System.out.println("From Final Method in Parent Class!");
    }
    static int variableStatic = 10;
    final static int variableFinal = 25;

}
class ChildClass extends ParentClass{

    public void childMethod(){
        System.out.println("This is Child class' method!");
    }
}
// Final Methods cannot be overriden in any case