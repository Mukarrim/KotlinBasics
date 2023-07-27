package com.example.kotlinbasics.challenges


fun canPlaceVendors(stalls: IntArray, k: Int, distance: Int): Boolean {
    val sortedStalls = stalls.sorted()

    if (sortedStalls.size < k) {
        return false
    }

    var prevPosition = sortedStalls[0]
    var count = 1

    for (i in 1 until sortedStalls.size) {
        if (sortedStalls[i] - prevPosition >= distance) {
            count++
            prevPosition = sortedStalls[i]

            if (count == k) {
                return true
            }
        }
    }

    return false
}

fun main() {
    val stalls = intArrayOf(1, 4, 2, 8, 9)
    val vendors = 4
    val D = 2

    val canPlace = canPlaceVendors(stalls, vendors, D)
    println(canPlace) // Output: false
}
