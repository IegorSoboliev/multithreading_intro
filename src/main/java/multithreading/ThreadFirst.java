package multithreading;

public class ThreadFirst extends Thread {
    private Counter counter;
    private static final int LIMIT = 100;

    public ThreadFirst(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() < LIMIT) {
            counter.increment();
            System.out.println("First thread is running. Value: " + counter.getValue());
        }
    }
}
