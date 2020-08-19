// FILE: 1.kt
open class Base

open class Derived1 : Base()
open class Derived2 : Base()
open class Derived3 : Base()

fun cond(s: String) = true

inline fun base(): Base = Derived3()

inline fun call() = Derived3()

// FILE: 2.kt
fun test(): Base {
    return if (cond("1")) base() else if (cond("2") ) Derived2() else Derived3()
}

fun box(): String {
    val res = test()
    return if (res is Derived3) "OK" else "fail $res"
}