package Ch6_ObjectsAndDataStructures

/**
 * Data/Object Anti Symmetry
 *      - Object: Hide their data, expose function that operate on that data.
 *        Data Structure: Expose their data, has no meaningful functions
 *
 *      - Procedural code: Code using data structures.
 *        OO Code: Code using objects
 *
 *      - Procedural code makes it easy to add new functions without changing the current data structures, makes it hard
 *          to add new data structures because all functions should be changed.
 *      - OO code makes it easy to add new data types without changing the current functions, makes it hard to add new
 *          functions because all classes should be changed.
 *
 *      - In a system, there should be times that
 *          1. We need procedural code because we will not add new data types but will add functions.
 *          2. We need OO code because we will not add new function but will add data types.
 *
 *      - I don't completely agree on using public data fields because mutators allows us to put logic on field assignments.
 *          For example, the health of a player should be in [0, 100] or the radius cannot be negative.
 *
 *      - In kotlin, use data classes as data structures. For other languages, you can use normal classes as data structures
 *          by creating conventions such as adding Data or DS to the class name.
 *
 *      - When to use data structures?
 *          If you have a data that is coming from a source such as database or server, use data structures with final
 *          public fields so no need for mutators because we assume the data coming from a source is correct and we will
 *          not change it ever. If we need to change the data, we should create another object.
 *          This data is called Data Transfer Objects.
 */

// Procedural Example
data class Point(val x: Double, val y: Double)
class NoSuchShapeException : Exception()

// The classes Square, Rectangle and Circle are data structures
class Square1 {
    var topLeft: Point? = null
    var side = 0.0
}

class Rectangle1 {
    var topLeft: Point? = null
    var height = 0.0
    var width = 0.0
}

class Circle1 {
    var center: Point? = null
    var radius = 0.0
}
// The data structures above have a flaw. For example, if anybody sets radius = -4.0, nothing can stop them. So, in that sense,
// either use mutators on private fields, or do not use data structures.

// This geometry class has all the functions for data structures above
class Geometry {
    val PI = 3.141592653589793

    @Throws(NoSuchShapeException::class)
    fun area(shape: Any?): Double {
        return when (shape) {
            is Square1 -> {
                val s = shape
                s.side * s.side
            }
            is Rectangle1 -> {
                val r = shape
                r.height * r.width
            }
            is Circle1 -> {
                val c = shape
                PI * c.radius * c.radius
            }
            else -> throw NoSuchShapeException()
        }
    }
}
// In this procedural code, if you want to add new function, add it inside the Geometry class. The Geometry class is the
// only thing to change here. However, if you add new data structure such as Triangle, You need to change all the functions
// inside the Geometry class.

// OO Example
interface Shape {}
class Square2 : Shape {
    private val topLeft: Point? = null
    private val side = 0.0
    fun area(): Double {
        return side * side
    }
}

class Rectangle2 : Shape {
    private val topLeft: Point? = null
    private val height = 0.0
    private val width = 0.0
    fun area(): Double {
        return height * width
    }
}

class Circle2 : Shape {
    private val center: Point? = null
    private val radius = 0.0
    val PI = 3.141592653589793
    fun area(): Double {
        return PI * radius * radius
    }
}
// This OO code has no flaw like we have in procedural code example.

// In this OO code, adding new shape is easy, we do not need to change the current classes. However, adding new functions
// will require changing all shape classes we have.