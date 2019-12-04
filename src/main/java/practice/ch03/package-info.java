/**
 * Notes:<br>
 * <br>
 * Chapter 3:<br>
 * <br>
 * Sub chapter 3.1<br>
 * <br>
 * - In the absence of proper synchronization compiler, processor and/or runtime can reorder the operations.<br>
 * - Locking is not only about mutual exclusion but also about memory visibility, so that all of the threads see
 * the most up-to-date values of shared variables.<br>
 * - Volatile variables can only guarantee visibility.<br>
 * Sub chapter 3.2<br>
 * - Do not allow to escape 'this' reference during construction.<br>
 */
package practice.ch03;