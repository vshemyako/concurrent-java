package practice.ch01;

/**
 * Thread-safe sequence generator.
 */
public class SafeSequenceGenerator {

    private int value;

    /**
     * @return current value in the sequence, simultaneously
     *         incrementing it.
     */
    public synchronized int getValue() {
        System.out.println(value);
        return value++;
    }
}
