package multithreading;

public class Counter {
    private int value = 0;

    public int increment() {
        return value++;
    }

    public int getValue() {
        return value;
    }
}
