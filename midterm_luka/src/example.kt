fun main(args: Array<String>) {
    //creating list of strings
    val topStudents = mutableListOf("Bonzo", "Jimmy", "Robert", "john paul")
    println("Top students number: " + topStudents.size)
    println("The index of the element Robert is: " + topStudents.indexOf("Robert"))
    println("The element at index 3 - " + topStudents[3])
    topStudents.remove("Bonzo")
    println("Top students number: " + topStudents.size)
    topStudents.add("Lil Bonzo")
    for (i in topStudents.indices) {
        println(topStudents[i])
    }

    topStudents.addAll(mutableListOf("Zappa", "Eddie Hazel"))
    println(topStudents)

    println("----------------------------------------------------------------------")
    val numbers = listOf(1, 5, 7, 32, 0, 21, 1, 6, 10)

    val num1 = numbers.get(0)
    println(num1)

    val num2 = numbers[7]
    println(num2)

    val index1 = numbers.indexOf(1)
    println("The first index of number is $index1")

    val index2 = numbers.lastIndexOf(1)
    println("The last index of number is $index2")

    val index3 = numbers.lastIndex
    println("The last index of the list is $index3")


}






