package thinking.ex01;

import org.junit.Test;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Verifies behavior of a {@link Counter} class.
 */
public class CounterTest {

    @Test
    public void shouldCreateSeparateThreads() throws InterruptedException {
        int threadCount = ThreadLocalRandom.current().nextInt(0, 5);
        List<Thread> threads = IntStream.range(0, threadCount)
                .mapToObj((number) -> new Thread(new Counter(3)))
                .collect(Collectors.toList());

        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            thread.join();
        }
    }
}