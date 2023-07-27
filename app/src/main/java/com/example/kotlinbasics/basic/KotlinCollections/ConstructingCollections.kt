package KotlinCollections

fun main(args: Array<String>) {

    val numberSet = setOf("one", "two", "three", "four")
    val emptySet = mutableSetOf<String>() //When creating empty collections always specify the type exactly '<String>'

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    //Creating mutable maps using the 'to' notation results in a high usage of resources.
    //Indicated way of doing it is by using the scope function APPLY to populate the map.

    val numbersMap1 = mutableMapOf<String, String>().apply {
        this["one"] = "1";
        this["two"] = "2";
        this["three"] = "1";
    }

    //Other way of creating collections is by using build function
    // buildMap / buildList / buildSet

    val map = buildMap { // this is MutableMap<String, Int>, types of key and value are inferred from the `put()` calls below
        put("a", 1)
        put("b", 0)
        put("c", 4)
    }

    println(map) // {a=1, b=0, c=4}

    //Other way of creating empty collections is by using the empty function
    // emptyMap / emptyList / emptySet

    val empty = emptyList<String>() //simillar to the above example of empty collections the type must always be specified.


}