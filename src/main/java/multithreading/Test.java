package multithreading;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        ThreadFirst threadFirst = new ThreadFirst(counter);
        ThreadSecond threadSecond = new ThreadSecond(counter);
        threadFirst.start();
        threadSecond.start();
        threadSecond.run();
    }
}
