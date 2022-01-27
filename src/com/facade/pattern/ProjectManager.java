package com.facade.pattern;

public class ProjectManager implements Person{
    @Override
    public void tellDesignation() {
        System.out.println("I am a project manager, I fix people's issues...");
    }
}
