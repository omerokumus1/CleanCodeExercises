package Ch3_Functions

/**
 * 1. Prefer Exceptions to Error Codes:
 *      - Instead of error codes like RESULT_OK, ERR, use exception
 *          Ex; public ErrorCode openPage() -> public void openPage() throws Exception
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