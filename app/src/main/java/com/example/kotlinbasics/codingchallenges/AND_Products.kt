package challenges

/*
* AND Product of Subarrays
*
* You have an array that consists of N integers. A subarray(i, j) from the array is non-empty sequence of consecutive elements.
* The AND-Product of sub-array(i, j) is calculated as a bitwise AND for all the elements in the subarray:
* AND-Product(i, j)=arr(i)&arr(i+1)
*
* Input -> 3
* 1 2 3
*
* Output -> 9
*
* The answer is calculated as a summation of six sub arrays as follows:
* AND-Product(1,1) + AND-Product(1,2) + AND-Product(1,3) + AND-Product(2,2) + AND-Product(2,3) + AND-Product(3,3)
*
* AND takes the binary equivalent and multiplies the values e.g. 0*0, 1*1
 */


fun main() {
    val arr = intArrayOf(1, 2, 3)
    val n = arr.size

    var result = 0

    for (i in 0 until n) {
        var temp = arr[i]

        // Calculate the AND-Product for the subarray starting at index i
        for (j in i until n) {
            temp = temp and arr[j]
            println("Value: $temp")
            result += temp
        }
    }

    println("Output: $result")
}


/*
*
fun main() {
    val arr = intArrayOf(1, 2, 3)
    val n = arr.size

    var result = 0

    for (i in 0 until n) {
        var temp = arr[i]

        // Calculate the AND-Product for subarrays starting at index i
        result += temp // Include the AND-Product of single elements

        for (j in i + 1 until n) {
            temp = temp and arr[j]
            result += temp
        }
    }

    println("Output: $result")
}
* */
