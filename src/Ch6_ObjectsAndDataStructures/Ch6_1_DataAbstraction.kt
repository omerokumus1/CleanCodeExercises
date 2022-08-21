package Ch6_ObjectsAndDataStructures

/**
 * Data Abstraction:
 *      - An object does not expose its variables. Instead, it provides function that outsiders can demand things depending
 *          on the variables. So, outsiders manipulates the object's variables through the object itself.
 *      - Instead of getting the object's variables and operate on them, make the object operate on them and return the result.
 *      - The functions that are provided for outsiders may be defined in an interface.
 *      - By using data abstraction, you can manage the data from a single point which is the inside of the class. If somehow
 *          you need to change the data type, say, from Double to Float, you do not need to scan over all the classes that
 *          uses this data, altering functions inside the class, uses this data will be enough.
 *          ** Single Point of Managing Data Field **
 */

// Example - Bad
interface VehicleBad {
    fun getFuelTankCapacity(): Double
    fun getGallonsOfGasoline(): Double
}
// This interface simply provides the accessors and the outsider probably uses this return values to calculate something.
// This is not we want, the outsider should not know about the inner of the object.

// Example - Good
interface VehicleGood {
    fun getPercentFuelRemaining(): Double
}
// This interface provides the job that the outsiders potentially need. It does not expose the objects inner structure.
// Instead, it provides function for outsiders to manipulate the variables through the object itself.