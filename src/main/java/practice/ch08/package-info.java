/**
 * Chapter 8:<br>
 * <br>
 * Sub chapter 8.1<br>
 * - Whenever you submit to an Executor tasks which are not independent be aware of thread starvation deadlock.<br>
 * - In case there's some pooled resource which is required by a task (or vice versa) - size of each is limited by the
 * maximum size of another.<br>
 * - Sequential loop iterations when each iteration is independent of the others are good candidates for parallelization.<br>
 **/
package practice.ch08;