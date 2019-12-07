fun main() {
    //Immutable maps
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("All keys: ${numbersMap.keys}") // Prints all keys
    println("All values: ${numbersMap.values}") // Prints all values
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map")
    println(numbersMap + Pair("abcd",5)) // Prints map + entered pair of keys,values
    println(numbersMap) // But the map doesnot change
    println("")

    //Mutable maps
    val numbersMap2 = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    // Getting values of keys
    println(numbersMap2.get("key3")) // null if not found
    println(numbersMap2["key3"]) // null if not found


    // println(numbersMap2.getValue("six")) // Exeption if not found
    println("")

    // Adding key-value pairs
    numbersMap2["key5"] = 5
    numbersMap2.put("key6", 6)
    numbersMap2 += mapOf("key7" to 4, "key8" to 8)
    println("")

    // Removing key-value pairs
    numbersMap2.remove("key8")
    numbersMap2.remove("key7", 7) // Doesnot remove if any of kay,value dont match

    // Map looping
    for (item in numbersMap2) {
        println(item)
    }
    println("")

    for ((k,v) in numbersMap2) {
        println("The value of $k is $v")
    }


}