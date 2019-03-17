package practice.ch01;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Verifies that {@link UnsafeSequenceGenerator} is indeed
 * implemented in non-safe thread manner.
 */
public class UnsafeSequenceGeneratorTest {

    private UnsafeSequenceGenerator sequenceGenerator;

    @Before
    public void setUp() {
        sequenceGenerator = new UnsafeSequenceGenerator();
    }

    /**
     * Just an illustration that multiple threads get the same numbers (race condition).
     */
    @Test
    public void shouldBeUnsafe() {
        int threadsNumber = Runtime.getRuntime().availableProcessors() * 2;
        System.out.println("Number of executing threads: " + threadsNumber);

        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(threadsNumber);
            for (int index = 0; index < threadsNumber; index++) {
                executorService.execute(() -> {
                    int nextValue = sequenceGenerator.getNextValue();
                    System.out.println(nextValue);
                });
            }
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}