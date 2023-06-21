package challenges

fun main() {
    do {
        val line = readLine()
        if (line != null) {
            val (purchasePriceStr, cashGivenStr) = line.split(";")
            val purchasePrice = purchasePriceStr.toDouble()
            val cashGiven = cashGivenStr.toDouble()

            val change = calculateChange(purchasePrice, cashGiven)
            println(change)
        }
    } while (line != null)
}

fun calculateChange(purchasePrice: Double, cashGiven: Double): String {
    val currencyValues = mapOf(
        "PENNY" to 0.01,
        "NICKEL" to 0.05,
        "DIME" to 0.10,
        "QUARTER" to 0.25,
        "HALF DOLLAR" to 0.50,
        "ONE" to 1.00,
        "TWO" to 2.00,
        "FIVE" to 5.00,
        "TEN" to 10.00,
        "TWENTY" to 20.00,
        "FIFTY" to 50.00,
        "ONE HUNDRED" to 100.00
    )

    val change = cashGiven - purchasePrice

    if (change < 0) {
        return "ERROR"
    } else if (change == 0.0) {
        return "ZERO"
    }

    val result = StringBuilder()
    val sortedCurrencyValues = currencyValues.toSortedMap(compareByDescending { currencyValues[it] })

    var remainingChange = change
    for (currencyValue in sortedCurrencyValues.values) {
        while (remainingChange >= currencyValue) {
            result.append(sortedCurrencyValues.entries.find { it.value == currencyValue }?.key)
            result.append(",")
            remainingChange -= currencyValue
            remainingChange = "%.2f".format(remainingChange).toDouble()
        }
    }

    return result.removeSuffix(",").toString()
}

//fun main() {
//    val input = readLine() ?: return
//    val (purchasePriceStr, cashGivenStr) = input.split(";")
//    val purchasePrice = purchasePriceStr.toDouble()
//    val cashGiven = cashGivenStr.toDouble()
//
//    val change = calculateChange(purchasePrice, cashGiven)
//    println(change)
//}
