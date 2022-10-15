package kotlinTest

import processing.core.PApplet
import processingLibrary2.HelloLibrary2

fun main() = PApplet.main(KotlinSketch2::class.java.name)

/**
 * Try running the program. This is not an actual test.
 * But at least can be used to try that the library
 * is working.
 */

class KotlinSketch2 : PApplet() {
    var helloLibrary2 = HelloLibrary2(this)

    init {
        helloLibrary2.printSomething()
    }
}