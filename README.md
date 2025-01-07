# Kotlin removeIf gotcha

This example demonstrates a potential pitfall when using the `removeIf` function with mutable collections in Kotlin. Unlike the `filter` function, `removeIf` directly modifies the original collection, which may lead to unexpected side effects if not handled carefully. 

The `bug.kt` file shows examples of `removeIf` modifying the List and Set in place. The `bugSolution.kt` file shows the correct way to use filter to create a new collection without modifying the original one.