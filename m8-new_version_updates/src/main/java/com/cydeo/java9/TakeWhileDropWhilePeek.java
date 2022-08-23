package com.cydeo.java9;

public class TakeWhileDropWhilePeek {
    /*
    The takeWhile() method of Stream API accepts all values until predicate returns false
    whereas dropWhile() method of Stream API drops all values until it matches the predicate.

    Dropping all the ones that is matching with the condition, until it sees something that doesn't match the condition.
    So if something else is also matching with the condition but it is after the one that doesn't match with the condition,
    it also not going to drop that one. => THUS, elements should be sorted first.

    peek() which being a consumer action basically returns a stream consisting of the elements of this stream
    Note:

This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline.
Since Java 9, if the number of elements is known in advance and unchanged in the stream, the .peek () statement will not be executed due to performance optimization. It is possible to force its operation by a command (formal) changing the number of elements eg. .filter (x -> true).
Using peek without any terminal operation does nothing.
     */
}
