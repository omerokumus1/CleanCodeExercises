package Ch3_Functions

/**
 * Command Query Separation:
 *      - Functions can accomplish tasks, but they should not do them at once.
 *      - Command and Query must be separated.
 *          Ex; boolean add(List list, Object e) -> void add(List list, Object e); boolean isAdded(Object e, List list);
 *
 */