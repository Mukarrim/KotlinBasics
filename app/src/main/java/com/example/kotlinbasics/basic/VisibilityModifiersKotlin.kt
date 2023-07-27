package Kotlin1603Class

/*
Visibility modifiers in Kotlin:
    ->!! Public !! We dont have public in kotlin as everything by default is set a public
    ->Private : Not available in other classes. Only accessed within the class.
    ->Open : Class open for extension
    ->Protected : Visible to the class and derived(child) classes only
    ->Internal : Visible inside the same module.

 */

open class Base() {
    var a = 1                 // public by default
    private var b = 2         // private to Base class
    protected open val c = 3  // visible to the Base and the Derived class
    internal val d = 4        // visible inside the same module

    protected fun e() {}     // visible to the Base and the Derived class
}

class Derived : Base() {

    // a, c, d, and e() of the Base class are visible
    // b is not visible

    override val c = 9        // c is protected
}

fun main(args: Array<String>) {
    val base = Base()
    base.a

    // base.a and base.d are visible
    // base.b, base.c and base.e() are not visible

    val derived = Derived()
    // derived.c is not visible
}