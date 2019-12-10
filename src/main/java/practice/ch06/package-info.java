/**
 * Chapter 6:<br>
 * <br>
 * Sub chapter 6.1<br>
 * Up to a certain point, more threads can improve throughput, but beyond that point creating more threads just slows<br>
 * down your application, and creating one thread too many can cause your entire application to crash horribly.<br>
 * Sub chapter 6.2<br>
 * The primary abstraction for asynchronous task execution in Java class libraries is <b>not Thread</b> but Executor.<br>
 * The easiest way to implement <b>producer - consumer</b> pattern is to use Executor.<br>
 * When you see code of the form:<br>
 * new Thread(runnable).start()<br>
 * and you think you might want a more flexible execution policy, seriously consider replacing it with Executor.<br>
 * There is no reason to use {@link java.util.Timer} class in Java 5.0 or later applications. Use {@link java.util.concurrent.ScheduledExecutorService}
 * instead.<br>
 **/
package practice.ch06;