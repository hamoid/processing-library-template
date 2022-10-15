package processingLibrary2;

import processing.core.PApplet;

public class HelloLibrary2 {
    static String VERSION = "0.0.1";

    String message = "foobar";
    PApplet parent;

    public HelloLibrary2(PApplet parent) {
        this.parent = parent;
        parent.registerMethod("dispose", this);
    }

    public String version() {
        return VERSION;
    }

    public void printSomething() {
        System.out.println(message);
    }

    public void dispose() {

    }
}
