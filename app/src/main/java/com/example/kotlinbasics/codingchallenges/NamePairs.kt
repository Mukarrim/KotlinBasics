package com.example.kotlinbasics.codingchallenges

fun main() {
    /*
    * Live Coding: You have a string array of full names(firstName lastName) and you have to return two arrays with first names and last names. There could be middle names for some names and only first names as well
    * */
    val result = splitFullNames(arrayOf("Adam Saint", "Who IS", "Nani"))
    println("First List:")
    result.first.forEach {
        println(it)
    }
    println("Last List:")
    result.second.forEach {
        println(it)
    }
}


fun splitFullNames(names: Array<String>): Pair<Array<String>, Array<String>> {
    val firstNames = Array(names.size) { "" }
    val lastNames = Array(names.size) { "" }
    for (i in names.indices) {
        val parts = names[i].split(" ")
        firstNames[i] = parts[0]
        lastNames[i] = if (parts.size > 1) parts[parts.size - 1] else ""
    }
    return Pair(firstNames, lastNames)
}