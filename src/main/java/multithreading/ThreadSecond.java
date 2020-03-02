package multithreading;

public class ThreadSecond implements Runnable {
    private Thread thread;
    private Counter counter;

    public ThreadSecond(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getValue() < 100) {
            counter.increment();
            System.out.println("Second thread is running. Value: " + counter.getValue());
        }
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
}
