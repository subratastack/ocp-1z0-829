package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
Equivalent to synchronized block, but it gives more control over the access
* */
public class ReentrantLockExample {

    public static int counter = 0;
    static Lock lock = new ReentrantLock();

    private static void reentrantLockMethod() {

        try {
            lock.lock();
            for (int i=0; i< 1_000_000; i++) {
                counter++;
            }
        } finally {
          lock.unlock();
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(ReentrantLockExample::reentrantLockMethod);
        Thread t2 = new Thread(ReentrantLockExample::reentrantLockMethod);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(ReentrantLockExample.counter);
    }
}
