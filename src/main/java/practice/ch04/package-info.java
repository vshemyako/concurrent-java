/**
 * Chapter 4:<br>
 * <br>
 * Sub chapter 4.1<br>
 * - Confinement makes it easier to build thread-safe classes because classes with confined state can be analyzed
 * for thread safety without the need to analyze the whole program.<br>
 * - There are advantages of using private lock object instead of object's intrinsic lock, because making lock object
 * private encapsulates the lock and the client cannot acquire it.<br>
 * Sub chapter 4.2<br>
 * - If a class is composed of multiple independent thread-safe state variables and has no operations that have any
 * invalid state transitions, then it can delegate thread safety to the underlying state variables.<br>
 * Sub chapter 4.3<br>
 * - If a state variable is thread-safe, doesn't participate in any invariants that constrain its value, and has no
 * prohibited state transitions for any of its operations, then it can be safely published.<br>
 * Sub chapter 4.5<br>
 * Document a class's thread safety guarantees for its clients; document its synchronization policy for its
 * maintainers.<br>
 */
package practice.ch04;