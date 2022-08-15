package Ch3_Functions.Ch3_1_FunctionArguments

/**
 * Argument Objects:
 *      - If a function has more than three arguments, a group of them ought to be wrapped into a class. Create a data
 *          class for those arguments, and send them through this class.
 *      ** If function name and argument names can be read together, there is no problem. Otherwise, problem.
 *
 */

// From
fun drawOnCanvas(x1: Double, y1: Double, x2: Double, y2: Double, lineColor: String, lineWidth: Int) = Unit

// To
class Point2D(val x: Double, val y: Double){}
class Line(val start: Point2D, val end: Point2D, color: String, width: Int) {}
fun drawOnCanvas(line: Line) = Unit

fun main() {
    val x1 = 1.0;    val y1 = 1.0
    val x2 = 2.0;    val y2 = 2.0
    val color = "red";    val width = 2

    // From
    drawOnCanvas(x1, y1, x2, y2, color, width)

    // To
    val start = Point2D(x1, y1); val end = Point2D(x2, y2)
    val line = Line(start, end, color, width)
    drawOnCanvas(line)
}

