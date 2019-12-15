package practice.ch07;

import org.junit.Assert;
import org.junit.Test;

public class InterruptionTest {

    /**
     * If a thread is not blocked by {@link Thread#sleep(long)} or {@link Object#wait()}
     * invoking its {@link Thread#interrupt()} method merely set interruption flag to true.
     */
    @Test
    public void shouldSetInterruptionToTrue() {
        Thread thread = Thread.currentThread();
        boolean initialState = thread.isInterrupted();
        thread.interrupt();
        boolean targetState = thread.isInterrupted();

        Assert.assertFalse(initialState);
        Assert.assertTrue(targetState);
    }
}
