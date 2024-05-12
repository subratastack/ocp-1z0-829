package concurrency;

public class SleepInterruptExample {

    public static void main(String[] args) {
        Thread sleeperThread = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep for 10 seconds...");
                Thread.sleep(10000);
                System.out.println("Woke up from sleep.");
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
                e.printStackTrace();
            } finally {
                System.out.println("We are done!!");
            }
        });

        sleeperThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        sleeperThread.interrupt();
    }

}
