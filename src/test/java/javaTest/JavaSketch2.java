package javaTest;

import processing.core.PApplet;
import processingLibrary2.HelloLibrary2;

public class JavaSketch2 extends PApplet {
    HelloLibrary2 helloLibrary2;

    public static void main(String[] args) {
        PApplet.main(new String[]{JavaSketch2.class.getName()});
    }

    @Override
    public void setup() {
        helloLibrary2 = new HelloLibrary2(this);
        helloLibrary2.printSomething();
    }
}