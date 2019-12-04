/**
 * Notes:<br>
 * <br>
 * Chapter 2:<br>
 * <br>
 * Sub chapter 2.0<br>
 * - Thread-safe code is about access management to a shared mutable state of an object.<br>
 * - There're three ways to make a program thread-safe:<br>
 * -- 1. Don't share state variables across threads<br>
 * -- 2. Make state variables immutable<br>
 * -- 3. Use synchronization whenever accessing state variables<br>
 * Sub chapter 2.1<br>
 * - Thread safe classes encapsulate any needed synchronization so that clients don't have to provide their own.<br>
 * - Stateless objects are always thread safe (local variables are stored on the thread's stack)<br>
 * <br>
 * Sub chapter 2.2<br>
 * - <b>Race condition</b> - check-then-act scenario when the correctness of a program relies on relative timing or
 * interleaving of multiple threads by the runtime.<br>
 * - <b>Data race</b> - read-modify-write scenario when synchronization is not used to coordinate access to a shared
 * mutable state.<br>
 * - <b>Compound action</b> - sequences of operations which have to be executed atomically in order to stay thread-safe.<br>
 * Sub chapter 2.3<br>
 * - When multiple variables participate in an invariant, they are no longer independent and the value of one constrains
 * the allowed values of the others. Thus to preserve state consistency, update related state variables in a single
 * operation.<br>
 * - <b>Mutex</b> - is a mutual exclusion lock which allows only one thread at most to own the lock.<br>
 * - <b>Reentrancy</b> - is a locking behavior when a thread tries to acquire a lock it already holds and succeeds.<br>
 * Sub chapter 2.4<br>
 * - Every shared mutable variable should be guarded by exactly one lock.<br>
 * - For every invariant that involves more than one variable, all the variables involved in that invariant must be
 * guarded by the same lock.<br>
 */
package practice;