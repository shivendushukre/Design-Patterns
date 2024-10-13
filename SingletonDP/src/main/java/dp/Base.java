package main.java.dp;

import java.io.Serial;
import java.io.Serializable;

/*
 * 1. constructor private - need to create object only once, if public we can have multiple objects
 *
 * 2. object creation with the help of method
 *
 * 3. create field to store object is private
 *
 * 4. If your program uses multiple threads, then the object will get created
 *    multiple times which we do not want. Need to use synchronized way of
 *    creating the object.
 * */

/*
 * How to break singleton class?
 *
 * 1. Using Reflection API
 * solution:
 *   1-> if obj is there, then throw exception from inside the constructor
 *   2-> use enum
 *
 * 2. Deserialization:
 * solution: implement readResolve method
 *
 * 3. cloning
 *
 * */

public class Base implements Serializable, Cloneable {

    private static Base base;
    private Base() {
        if (base != null) {
            throw new RuntimeException("You are breaking singleton pattern");
        }
    }

    // lazy initialization
    public static Base getInstance() {
        // object of class
        if (base == null) {
            synchronized (Base.class) {
                base = new Base();
            }
        }
        return base;
    }

    @Serial
    public Object readResolve() {
        return base;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return base;
    }

}
