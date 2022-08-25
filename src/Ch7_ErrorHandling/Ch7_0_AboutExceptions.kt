package Ch7_ErrorHandling

/**
 * 1. Prefer Exceptions to Error Codes:
 *      - Instead of error codes like RESULT_OK, ERR, use exception
 *          Ex; public ErrorCode openPage() -> public void openPage() throws Exception
 *      - If error codes used, the caller must check the returned value immediately after calling the function, which is a
 *          thing that can be forgotten easily.
 *      - Write a method that concerns about exception handling and create another method which incorporates the logic and
 *          throws exception, preferably unchecked exceptions.
 */


/**
 * 2. Extract Try/Catch Blocks
 *      - If there should be an error handling, there should be a function for each try/catch block.
 *      - Wrap each try/catch block with a function
 */


/**
 * 3. Exception Handling is One Thing
 *      - Exception handling is a job in its own right. So, the function should be responsible only for exception handling,
 *          nothing more
 */


/**
 * 4. Write try-catch-finally Statement First
 *      - The first thing that should be done should be writing try-catch-finally statement first. It is like a bread-first
 *          approach; you define the upper layer first, then go one layer below.
 */