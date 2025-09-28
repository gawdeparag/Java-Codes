package SingletonExample.waystodeclareSingleton;

public class BillPughSingleton {
    private BillPughSingleton() { }

    private static class Helper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Helper.INSTANCE;
    }
}
