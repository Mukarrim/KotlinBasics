package KotlinOOP

class Lamp{
    //Properties of the class.
    private var isOn: Boolean = false

    //Class functions defined below.
    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun displayLightStatus(lamp: String) {
        if (isOn == true)
            println("$lamp lamp is on.")
        else
            println("$lamp lamp is off.")
    }
}

fun main() {
    //Objects of the class instantiated.
    val l1 = Lamp()
    val l2 = Lamp()

    //Objects using the method of the class.
    l1.turnOn()
    l2.turnOff()

    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")
}