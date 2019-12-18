/**
 * Chapter 7:<br>
 * <br>
 * Sub chapter 7.1<br>
 * An activity is cancellable if an external code can move it to completion before its normal completion.<br>
 * Calling interrupt does not necessarily stop the target thread from doing what it is doing; it merely delivers the
 * message that interruption has been requested.<br>
 * Interruption is the most sensible way to implement cancellation.<br>
 * Because each thread has its own interruption policy, you should not interrupt a thread unless you know what
 * interruption means to that thread.<br>
 * Only code that implements thread's interruption policy may swallow the interruption request. General purpose code
 * or library should never swallow an interruption request.<br>
 * When {@link java.util.concurrent.Future#get()} throws {@link java.lang.InterruptedException} or
 * {@link java.util.concurrent.TimeoutException} and you know that the result is not longer needed use {@link java.util.concurrent.Future#cancel(boolean)}
 * method.<br>
 * For long-running applications always use uncaught exception handlers for all thread to at least log the exceptions.<br>
 **/
package practice.ch07;