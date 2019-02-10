package thinking.ex01;

/**
 * A device for counting.
 */
public class Counter implements Runnable {

    private int count;

    public Counter(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Count should be greater than '0'");
        }
        this.count = count;
        System.out.println("Initialization");
    }

    /**
     * Decreases count number.
     */
    @Override
    public void run() {
        while (count >= 0) {
            System.out.println(this.toString());
            count--;
            Thread.yield();
        }
        System.out.println("Destruction");
    }

    /**
     * Prints current count.
     */
    @Override
    public String toString() {
        return String.format("Count: %d", count);
    }
}
