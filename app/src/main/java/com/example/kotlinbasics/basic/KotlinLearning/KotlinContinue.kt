package KotlinLearning

fun main() {
    //Example 1
    for (i in 1..5) {
        println("$i Always printed.")
        if (i > 1 && i < 5) {
            continue
        }
        println("$i Not always printed.")
    }
    //Continue is used only with if else conditions.
}