package com.basics;

public class StrategyPattern {

}
 class Base {/*
    private final Strategy impl;

    // Public factory method uses DefaultStrategy
    // You could also use a public constructor here, but then subclasses would
    // be able to use that public constructor instead of the protected one
    public static Base newInstance() {
        return new Base(new DefaultStrategy());
    }

    // Subclasses must provide a Strategy implementation
    protected Base(Strategy impl) {
        this.impl = impl;
    }

    // Method is final: subclasses can "override" by providing a different
    // implementation of the Strategy interface
    public final void foo() {
        impl.foo();
    }


    
*/}
/*
 // A subclass must provide an object that implements this interface
  interface Strategy {
     void foo();
 }
//This implementation is private, so subclasses cannot access it
 // It could also be made protected if you prefer
 private static DefaultStrategy implements Strategy {
     @Override
     public void foo() {
         // Default foo() implementation goes here
     }
 }*/