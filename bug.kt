fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    // This example demonstrates that removeIf modifies the original collection
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val newList = list2.filter { it <= 2 }
    println(list2) //Output: [1, 2, 3, 4, 5]
    println(newList) //Output: [1, 2]
}