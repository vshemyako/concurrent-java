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
 */
package practice;