// lists in Kotlin


// ----------------------------------------------------------------

fun difference(args: Array<String>) {

    val array = arrayOf(1, 2, 3)
    array[2] = 4 // OK
    for (element in array) {
        println("$element, ") // 1, 2, 4
    }

    val list = listOf("apple", "ball", "cow")
    list[2] = "cat" //will not compile, lists are immutable
// println(list) = {apple, ball, cow}


// ----------------------------------------------------------------


    val a = arrayOf(1, 2, 3)
    println(a.size) // will always be 3 for this array


    val l = mutableListOf(1, 2, 3)
    l.add(4)
    println(l.size) // 4


// ----------------------------------------------------------------

    val optimisedIntegerArray = intArrayOf(1, 2, 3, 4, 5, 6) // optimised for Integer Array
    val optimisedDoubleArray = doubleArrayOf(1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8) // Optimised for Double Array
    val optimisedCharacterArray = charArrayOf('a', 'b', 'c', 'd') // Optimised for Character Array
//List does not have intListOf, charListOf as such it is not optimised for primitive arrays


// ----------------------------------------------------------------
}