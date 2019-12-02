package practice.ch01;

/**
 * Generates non-thread safe sequence generator.
 */
public class UnsafeSequenceGenerator {

    private int value;

    /**
     * @return current value in the sequence, simultaneously
     *         incrementing it for further retrieval.
     */
    public int getNextValue() {
        return value++;
    }

    /**
     * @return current value in the sequence, without incrementing it.
     */
    public int getCurrentValue() {
        return value;
    }
}
