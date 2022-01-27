package com.facade.pattern;

public class Programmer implements Person{
    @Override
    public void tellDesignation() {
        System.out.println("I am a programmer, I fix people's problem...");
    }
}
