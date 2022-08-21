package Ch6_ObjectsAndDataStructures

/**
 * The Law Of Demeter:
 *      - A module should not know about the innards of the objects it manipulates.
 *      - A method f of a class C should only call the methods of these:
 *          1. C
 *          2. An object in data field
 *          3. An object passed as an argument to f
 *          4. An object created by f
 *          This is called "talk to friends, not to strangers"
 *
 *      - The law of demeter also says that a function should not call methods on objects that are returned by any of the
 *          allowed functions. For example, this is not allowed
 *              val outputDir = ctxt.getOptions().getScratchDir().getAbsolutePath();
 *
 *          Instead, make object ctxt expose a function that returns outputDir or, even better, returns an object that what
 *              the callee want to create by using outputDir.
 *
 *          Ex;
 *          Bad coding:
 *              String outputDir = ctxt.getOptions().getScratchDir().getAbsolutePath();
 *              String outFile = outputDir + "/" + className.replace('.', '/') + ".class";
 *              FileOutputStream fout = new FileOutputStream(outFile);
 *              BufferedOutputStream bos = new BufferedOutputStream(fout);
 *              - Here, we get outputDir which is a field of an object, and let the calle operate on that field. This is
 *                  not we want to do. We want objects itself operates on their innards. We should tell objects to do something,
 *                  we should not be telling about their innards.
 *
 *          Good coding:
 *              BufferedOutputStream bos = ctxt.createScratchFileStream(classFileName);
 *              - Here, we let ctxt creates the BufferedOutputStream object by passing classFileName to it.
 *              - If classFileName is a field of an object, then we can do two things;
 *                  1. Create a BufferedOutputStream with an empty classFileName inside one of the objects, return it and
 *                      pass it as an argument to the other object.
 *                  2. If BufferedOutputStream cannot be created with an empty classFieldName,
 *                      2.1. Create a class that simulates BufferedOutputStream with an empty classFieldName
 *                      2.2. One of the objects returns this created class
 *                      2.3. The other object takes as argument the returned class, and returns BufferedOutputStream
 *
 */