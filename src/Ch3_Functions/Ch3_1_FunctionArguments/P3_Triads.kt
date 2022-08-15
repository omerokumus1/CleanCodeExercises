package Ch3_Functions.Ch3_1_FunctionArguments

/**
 * Triads:
 *      - If you end up with a triad, try to reduce it to dyad or monad.
 *      - Reducing can be done via the ways specified in the dyad section. However, in case of triad, you need to apply
 *          the rules twice. The first one reduces the triad to a dyad, and the second one produces a monad out of the dyad.
 *      ** If function name and argument names can be read together, there is no problem. Otherwise, problem.
 *          - Ex;
 *              makeCircle(x, y, radius) -> no problem
 *              makeCircle(1.2, 2.2, 5.6) -> problem
 */

// - Triad to dyad
class Point(val x: Double, val y: Double) {
}
fun makeCircle(center: Point, radius: Double) = Unit
fun makeCircle(x: Double, y: Double, center: Double) = Unit

fun main() {
    val cx = 1.0
    val cy = 2.0
    val r = 4.0
    // Triad
    makeCircle(cx, cy, r)

    // Dyad
    val center = Point(cx, cy)
    makeCircle(center, r)
}