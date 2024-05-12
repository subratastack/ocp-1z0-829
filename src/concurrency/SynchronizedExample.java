package concurrency;

public class SynchronizedExample {

    private static int countWithLock = 0;
    private static int countWithoutLock = 0;
    static final Object lock = new Object();

    private static void synchronizedBlockMethod() {
        synchronized (lock) {
            for (int i=0; i<1_000_000; i++) {
                countWithLock++;
            }
        }
        for (int i=0; i<1_000_000; i++) {
            countWithoutLock++;
        }
    }

    public static synchronized void synchronizedMethod() {
        for (int i=0; i<1_000_000; i++) {
            countWithLock++;
        }

        for (int i=0; i<1_000_000; i++) {
            countWithoutLock++;
        }
    }

    public static void main(String[] args) {

        // Thread t1 = new Thread(SynchronizedExample::synchronizedBlockMethod);
        // Thread t2 = new Thread(SynchronizedExample::synchronizedBlockMethod);

        Thread t1 = new Thread(SynchronizedExample::synchronizedMethod);
        Thread t2 = new Thread(SynchronizedExample::synchronizedMethod);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(SynchronizedExample.countWithLock);
        System.out.println(SynchronizedExample.countWithoutLock);
    }
}
