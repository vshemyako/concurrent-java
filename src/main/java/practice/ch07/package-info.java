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
 **/
package practice.ch07;