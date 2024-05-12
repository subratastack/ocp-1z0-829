package concurrency;

import java.util.concurrent.*;

public class ScheduledExecutorExample {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable taskOne = () -> System.out.println("Hello world");
        Callable<Integer> taskTwo = () -> 2 + 2;

        ScheduledFuture<?> resultOne = service.schedule(taskOne, 15, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(taskOne, 20, 10, TimeUnit.SECONDS);
        ScheduledFuture<Integer> resultTwo = service.schedule(taskTwo, 30, TimeUnit.SECONDS);
        try {
            System.out.println(resultTwo.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            // service.shutdown();
        }
    }
}
