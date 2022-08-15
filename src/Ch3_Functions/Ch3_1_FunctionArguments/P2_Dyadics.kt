package Ch3_Functions.Ch3_1_FunctionArguments

/**
 * Dyads:
 *      - If arguments have natural cohesion and natural ordering such as (x,y) -> Point(x, y) in cartesian plane, no problem.
 *          Otherwise, try to reduce the dyad into monad.
 *
 * Reducing a Dyad into Monad:
 *      1. Add the method as an instance method to one of the arguments so that you can call the method as
 *          firstArg.method(secondArg).
 *          1.1. For kotlin, write extension function
 *          Ex; writeField(outputStream, name) -> outputStream.writeField(name)
 *
 *      2. Make one of the argument member variable of the class so that you don't have to pass it as parameter.
 *          2.1. This can be dangerous since parameter are not shown anymore and keeping track of them or understanding
 *                  which variables are in the action may not be easy.
 *          2.2. In this type of scenerio, make changes to the name of the function so that we can see the variables that
 *                  is made a member variable.
 *          Ex; writeField(outputStream, name) -> writeFieldToOutputStream(name), outputStream is made a member variable
 *
 *      3. Create another class which has the method in it and takes one of the arguments in its constructor.
 *          3.1. This way is somehow tedious.
 *          Ex; writeField(outputStream, name) -> fieldWriter = FieldWriter(outputStream); fieldWriter.write(name);
 *
 */


/**
 * 1. Add the method as an instance method to one of the arguments so that you can call the method as
 */
class OutputStream() {

}

// 1.
fun OutputStream.writeField(name: String) = Unit

// 2.
val outputStream2 = OutputStream()
fun writeFieldIntoOutputStream(name: String) = Unit

// 3.
class FieldWriter(val outputStream: OutputStream) {
    fun write(name: String) = Unit
}

fun main() {
    val outputStream = OutputStream()
    val name = "name"

    // 1.
    outputStream.writeField(name)

    // 2.
    writeFieldIntoOutputStream(name)

    // 3.
    val outputStream3 = OutputStream()
    val fieldWriter = FieldWriter(outputStream3)
    fieldWriter.write(name)
}