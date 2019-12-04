package practice.ch03;

/**
 * Variables visibility is not shared between threads by default.
 */
public class NoSharedVisibility {

    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {

        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }

            System.out.println("The number is " + number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}
