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
 * Sub chapter 3.3<br>
 * - <b>Thread confinement</b> - access to an object is confined to a single thread.<br>
 * - <b>Stack confinement</b> - special case of thread confinement, when an object can be reached only through local
 * variables.<br>
 * Sub chapter 3.4<br>
 * - Immutable objects are always thread safe.<br>
 * - It's always good idea to make all of the fields final unless they need to be mutable.<br>
 * Sub chapter 3.5<br>
 * - Immutable objects can be used safely by any thread without additional synchronization even when no synchronization
 * was used to publish them.<br>
 */
package practice.ch03;