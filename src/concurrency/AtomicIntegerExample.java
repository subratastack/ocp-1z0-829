package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

class ExecutionClass implements Runnable {

    public static final AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i<1_000_000; i++) {
            counter.incrementAndGet();
        }
    }
}

public class AtomicIntegerExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExecutionClass());
        Thread t2 = new Thread(new ExecutionClass());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(ExecutionClass.counter.get());
    }
}
