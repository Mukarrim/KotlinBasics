package com.example.kotlinbasics.challenges

fun canPlaceVendors(stalls: IntArray, k: Int): Int {
    val sortedStalls = stalls.sorted()
    var left = 0
    var right = sortedStalls.last() - sortedStalls.first()
    var maxD = 0

    while (left <= right) {
        val mid = (left + right) / 2
        var count = 1
        var prevPosition = sortedStalls[0]

        for (i in 1 until sortedStalls.size) {
            if (sortedStalls[i] - prevPosition >= mid) {
                count++
                prevPosition = sortedStalls[i]

                if (count == k) {
                    break
                }
            }
        }

        if (count == k) {
            maxD = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    return maxD
}

fun main() {
    val stalls = intArrayOf(1, 4, 2, 8, 9)
    val vendors = 2

    val maxD = canPlaceVendors(stalls, vendors)
    println(maxD)
}
