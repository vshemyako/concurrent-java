package thinking.ex02;

import java.util.ArrayList;
import java.util.List;

/**
 * Generates a Fibonacci sequence of numbers.
 */
public class FibonacciGenerator implements Runnable {

    private final int sequenceSize;

    public FibonacciGenerator(int sequenceSize) {
        if (sequenceSize <= 0) {
            throw new IllegalArgumentException("Sequence size has to be greater than '0'");
        }
        this.sequenceSize = sequenceSize;
    }

    @Override
    public void run() {
        List<Integer> sequence = generate();
        System.out.println(sequence);
    }

    private List<Integer> generate() {
        List<Integer> sequence = new ArrayList<>();

        while (sequence.size() < sequenceSize) {
            int sequenceSize = sequence.size();
            if (sequenceSize < 2) {
                sequence.add(1);
            } else {
                int nextNumber = sequence.get(sequenceSize - 2) + sequence.get(sequenceSize - 1);
                sequence.add(nextNumber);
            }
        }

        return sequence;
    }
}
