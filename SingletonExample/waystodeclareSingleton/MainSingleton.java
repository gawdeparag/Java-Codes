package SingletonExample.waystodeclareSingleton;

public class MainSingleton {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton.hashCode());
        System.out.println(enumSingleton1.hashCode());
        if (enumSingleton == enumSingleton1) {
            System.out.println("ENUM SINGLETON WORKS!");
        }

        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
        System.out.println(billPughSingleton1.hashCode());
        System.out.println(billPughSingleton.hashCode());
        if (billPughSingleton == billPughSingleton1) {
            System.out.println("BILL PUGH SINGLETON WORKS!");
        }

        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton.hashCode());
        System.out.println(threadSafeSingleton1.hashCode());
        if (threadSafeSingleton == threadSafeSingleton1) {
            System.out.println("THREAD SAFE SINGLETON WORKS!");
        }

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println(lazySingleton.hashCode());
        System.out.println(lazySingleton1.hashCode());
        if (lazySingleton == lazySingleton1) {
            System.out.println("LAZY SINGLETON WORKS!");
        }

        DoubleCheckLockingSingleton doubleCheckLockingSingleton = DoubleCheckLockingSingleton.getInstance();
        DoubleCheckLockingSingleton doubleCheckLockingSingleton1 = DoubleCheckLockingSingleton.getInstance();
        System.out.println(doubleCheckLockingSingleton.hashCode());
        System.out.println(doubleCheckLockingSingleton1.hashCode());
        if (doubleCheckLockingSingleton == doubleCheckLockingSingleton1) {
            System.out.println("DOUBLE CHECK LOCKING SINGLETON WORKS!");
        }


    }
}
