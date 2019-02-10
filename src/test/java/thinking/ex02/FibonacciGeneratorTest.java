package thinking.ex02;

import org.junit.Test;

public class FibonacciGeneratorTest {

    @Test
    public void shouldGenerateSequence() throws InterruptedException {
        Thread thread = new Thread(new FibonacciGenerator(10));
        thread.start();
        thread.join();
    }
}