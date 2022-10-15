package processingLibrary2

import processing.core.PApplet

/**
 * A Processing library
 *
 * @param parent         Parent PApplet, normally "this" when called from setup()
 */
class HelloLibrary1 constructor(private val parent: PApplet) {
    val VERSION = "0.0.1"

    var message = "something"

    init {
        parent.registerMethod("dispose", this)
    }


    /**
     * Return the version of the library.
     *
     * @return String
     */
    fun version() = VERSION

    /**
     * Prints something beautiful
     *
     */
    fun printSomething() = println(message)

    /**
     * Shutting down.
     */
    fun dispose() {

    }
}
