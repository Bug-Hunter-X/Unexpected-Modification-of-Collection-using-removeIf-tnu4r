fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }
    println(list) // Output: [1, 2, 3, 4, 5] - Original list is unchanged
    println(newList) // Output: [1, 2] - New list contains filtered elements

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.filter { it <= 2 }.toSet()
    println(set) // Output: [1, 2, 3, 4, 5] - Original Set is unchanged
    println(newSet) // Output: [1, 2] - New set contains filtered elements
    
    //In case you really need to modify the original list
    val list2 = mutableListOf(1,2,3,4,5)
    list2.removeAll { it > 2 }
    println(list2)// Output: [1,2]
} 