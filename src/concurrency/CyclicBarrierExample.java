package concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        Runnable workerTask = () -> {

            String name = Thread.currentThread().getName();
            System.out.println(name + " is running the first part...");

            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }

            System.out.println(name + " running the rest of the code.");
        };

        Thread t1 = new Thread(workerTask, "Worker-1");
        Thread t2 = new Thread(workerTask, "Worker-2");
        Thread t3 = new Thread(workerTask, "Worker-3");
        Thread t4 = new Thread(workerTask, "Worker-4");
        Thread t5 = new Thread(workerTask, "Worker-5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
