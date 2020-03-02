package multithreading;

public class ThreadFirst extends Thread {
    private Counter counter;

    public ThreadFirst(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() < 100) {
            if (counter.getValue() % 2 == 0) {
                yield();
            }
            counter.increment();
            System.out.println("First thread is running. Value: " + counter.getValue());
        }
    }

    @Override
    public synchronized void start() {
        super.start();
    }
}
