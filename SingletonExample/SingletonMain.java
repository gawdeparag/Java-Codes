package SingletonExample;

public class SingletonMain {

    public static void main(String[] args) {
        SingletonClass singleton = SingletonClass.instance;
        System.out.println(singleton.hashCode());

        SingletonClass singleton2 = SingletonClass.instance;
        System.out.println(singleton2.hashCode());

        if (singleton == singleton2) {
            System.out.println("Pointing at the same instance, created with the help of SingletonExample.SingletonClass class");
        } else {
            System.out.println("Different instances");
        }

        singleton.s = "Hello world in main";
        if (singleton.s == singleton2.s) {
            System.out.println("Immutability of SingletonExample.SingletonClass class is compromised");
            System.out.println(singleton.s);
        } else {
            System.out.println("Immutability of SingletonExample.SingletonClass class is not compromised");
        }

        ThreadOne threadOne = new ThreadOne();
        Thread thread = new Thread(threadOne);
        thread.start();
    }
}

class ThreadOne implements Runnable {
    public void run() {
        SingletonClass.instance.s = "Hello world in Thread One.";
        System.out.println(SingletonClass.instance.s);
    }
}

// This is not a correct way of initializing a singleton class
// Reason: The static block already creates a new SingletonExample.SingletonClass instance when the class is loaded.
// The getInstance() method will then check if (instance == null). 
// Since the static block already initialized instance, this condition will never be true. 
// The getInstance() method will always return the instance created by the static block, 
// but its code for creating a new instance will never be executed. 
// While your code will produce a single instance, its combination of two initialization strategies 
// is confusing and demonstrates a misunderstanding of how they work. 
// A correct singleton uses one strategy or the other, not both. 
class SingletonClass {
    public static SingletonClass instance;
    public String s;

    private SingletonClass() {
        s = "Hello I am part of SingletonExample.SingletonClass class";
    }

    static {
        instance = new SingletonClass();
    }

    public static synchronized SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}