package practice.ch01;

import org.junit.Assert;
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
    private static int loopIterationsNumber = 10000;
    private static int targetNumber = threadsNumber * loopIterationsNumber;

    /**
     * Just an illustration that multiple threads get the same numbers (race condition).
     */
    @Test
    public void shouldBeUnsafe() throws InterruptedException {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(threadsNumber);
            for (int index = 0; index < threadsNumber; index++) {
                executorService.execute(unsafeIncrement);
            }
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }

        Thread.sleep(1000);
        int currentValue = unsafeSequenceGenerator.getCurrentValue();
        Assert.assertTrue(targetNumber > currentValue);
    }

    private static Runnable unsafeIncrement = () -> {
        for (int i = 0; i < loopIterationsNumber; i++) {
            unsafeSequenceGenerator.getNextValue();
        }
    };

    /**
     * Just an example that different threads do not run a race condition.
     */
    @Test
    public void shouldBeSafe() {
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