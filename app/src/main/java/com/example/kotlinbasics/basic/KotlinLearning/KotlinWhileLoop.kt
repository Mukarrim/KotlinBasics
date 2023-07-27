package KotlinLearning

 fun main() {
     //Exercise 1

     /*var i = 1

     while (i <= 5) {
         println("Line $i")
         ++i
     }*/

     //Exercise 2

     /*var sum = 0
     var i = 100

     while (i != 0) {
         sum += i     // sum = sum + i;
         --i
     }
     println("sum = $sum")*/

     //Exercise 3 -> Do While

     var sum: Int = 0
     var input: String

     do {
         print("Enter an integer: ")
         input = readLine()!!
         sum += input.toInt()

     } while (input != "0")

     println("sum = $sum")
}