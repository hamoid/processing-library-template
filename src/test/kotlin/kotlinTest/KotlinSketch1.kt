package kotlinTest

import processing.core.PApplet
import processingLibrary2.HelloLibrary1

fun main() = PApplet.main(KotlinSketch1::class.java.name)

/**
 * Try running the program. This is not an actual test.
 * But at least can be used to try that the library
 * is working.
 */

class KotlinSketch1 : PApplet() {
    var helloLibrary1 = HelloLibrary1(this)

    init {
        helloLibrary1.printSomething()
    }
}