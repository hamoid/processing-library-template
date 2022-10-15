package javaTest;

import processing.core.PApplet;
import processingLibrary2.HelloLibrary1;

public class JavaSketch1 extends PApplet {
    HelloLibrary1 helloLibrary1;

    public static void main(String[] args) {
        PApplet.main(new String[]{JavaSketch1.class.getName()});
    }

    @Override
    public void setup() {
        helloLibrary1 = new HelloLibrary1(this);
        helloLibrary1.printSomething();
    }
}