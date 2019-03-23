package practice.ch01;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Verifies that {@link UnsafeSequenceGenerator} is indeed
 * implemented in non-safe thread manner.
 */
public class UnsafeSequenceGeneratorTest {
    private static UnsafeSequenceGenerator unsafeSequenceGenerator = new UnsafeSequenceGenerator();
    private static SafeSequenceGenerator safeSequenceGenerator = new SafeSequenceGenerator();
    private static int threadsNumber = Runtime.getRuntime().availableProcessors() * 2;

    /**
     * Just an illustration that multiple threads get the same numbers (race condition).
     */
    @Test
    public void shouldBeUnsafe() {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(threadsNumber);
            for (int index = 0; index < threadsNumber; index++) {
                executorService.execute(() -> {
                    int nextValue = unsafeSequenceGenerator.getNextValue();
                    System.out.println(nextValue);
                });
            }
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }

    /**
     * Just an example that different threads do not run a race condition.
     */
    @Test
    public static void main(String... args) {
        ScheduledExecutorService executorService = null;
        try {
            executorService = Executors.newScheduledThreadPool(threadsNumber);
            for (int index = 0; index < threadsNumber; index++) {
                executorService.schedule(() -> {
                    safeSequenceGenerator.getValue();
                }, 1, TimeUnit.SECONDS);
            }
        } finally {
            System.out.println("Finished");
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}