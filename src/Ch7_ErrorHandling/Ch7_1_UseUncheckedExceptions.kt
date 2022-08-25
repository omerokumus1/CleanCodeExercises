package Ch7_ErrorHandling

import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException

/**
 * Use Unchecked Exceptions
 *      - Checked exceptions: Checked at compile time. Need to be handled immediately by either try-catch or rethrowing
 *        Unchecked exceptions: Checked at run time such as NullPointer, IndexOutOfBound etc. Not need to be handled immediately.
 *
 *      - Checked exceptions are a part of the method signature. Hence, they create a dependency. For example, say method
 *          m1 is responsible for exception handling. m1 calls m2, m2 calls m3 and m3 throws a checked exception. This
 *          implies that m3 has the exception in its signature as well as m2. Here, we have 2 dependencies. If m3 changes
 *          the thrown exception, than m2 has to change it in its signature as well.
 *      - From Clean Code: The price of checked exceptions is an Open/Closed Principle1 violation. If you throw a checked
 *          exception from a method in your code and the catch is three levels above, you must declare that exception in the
 *          signature of each method between you and the catch. This means that a change at a low level of the software can force
 *          signature changes on many higher levels. The changed modules must be rebuilt and redeployed, even though nothing
 *          they care about changed.
 *      - From Clean Code: Consider the calling hierarchy of a large system. Functions at the top call functions below them,
 *          which call more functions below them, ad infinitum. Now let’s say one of the lowest level functions is modified
 *          in such a way that it must throw an exception. If that exception is checked, then the function signature must add
 *          a throws clause. But this means that every function that calls our modified function must also be modified either
 *          to catch the new exception or to append the appropriate throws clause to its signature. Ad infinitum.
 *          The net result is a cascade of changes that work their way from the lowest levels of the software to the highest!
 *
 *      - Fortunately, kotlin has no
 *
 *      - How to avoid checked exceptions?
 *          Create an unchecked version of each checked exception that you throw. Once you catch that exception, throw the
 *          unchecked version of it.
 *
 *      - How to create an unchecked exception class?
 *          Say you want to create unchecked version of FileNotFoundException
 *              class UFileNotFoundException extends RuntimeException
 *
 *          For more: https://rollbar.com/blog/how-to-handle-checked-unchecked-exceptions-in-java/
 *
 *      - When to use checked exceptions?
 *          If you have an exception that has to be dealt with immediately, use checked exceptions.
 *
 */

