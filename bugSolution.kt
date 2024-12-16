fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    list.removeAll(evenNumbers)
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val evenNumbersSet = set.filter { it % 2 == 0 }
    set.removeAll(evenNumbersSet)
    println(set) // Output: [1, 3, 5]
} 