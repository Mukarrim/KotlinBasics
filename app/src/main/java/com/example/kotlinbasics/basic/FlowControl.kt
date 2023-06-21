fun main(args : Array<String>) {

    var coffee = arrayOf("Espresso", 10, false, 99.34F) // Arrays can hold multiple data types
    println(coffee[3])

    var arr= arrayOf<Int>(22, 33, 44) // Arrays with specific data types


    for (i in 1..5){
        println(i)
    }

    for(item in coffee){
        println(item)
    }
}