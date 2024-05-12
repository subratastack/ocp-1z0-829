package concurrency;

import java.util.concurrent.*;

public class FutureInterfaceExample {

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<?> result = service.submit(() -> {
            long count = 0;
           for (int i=0; i< 10_000_000; i++) {
               count++;
           }
        });

        try {
            var value = result.get(1, TimeUnit.MILLISECONDS);
            if (value != null) {
                System.out.println("Task completed!");
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }
}
