package Ch3_Functions.Ch3_1_FunctionArguments

/**
 * 3 Types of monadics:
 *      1. A monadic that is being asked by yes-no question:
 *          - It should return a boolean value
 *          - Ex; boolean fileExists(String fileName)
 *      2. A monadic that transforms the argument into another form:
 *          - It should return the target-typed variable
 *          - The return variable may be assigned to a property. It should not be done in the function. The function must
 *          return the variable and the assignment must be done by returning because the job of the function is to make
 *          the transformation not the assignment. (It would violate the single job principle if it assigns as well)
 *          - Ex; InputStream fileOpen(String fileName)
 *      3. A monadic that alter the state of the program called an event:
 *          - There is no return type. It should change the state/data fields of the program
 *          - Ex; void passwordAttemptFailedNtimes(int attempts)
 *
 * If you have a monadic (a function with only one argument), be sure that this monadic in the form of one of them above.
 *
 */




