package ThreadProblems;

class Counter {
    int count;

    // "synchronized" is used when two or more threads are trying to access a shared resource
    public synchronized void increment() {
        count++;
    }
}

public class SynchronizeThreads {
    public static void main(String[] args) {

        Counter c = new Counter();

        Runnable r1 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c.count);
    }
}
