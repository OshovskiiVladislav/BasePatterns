package com.oshovskii.base_patterns.structural.composite;

public class JavaDeveloper implements Developer{
    @Override
    public void createProject() {
        System.out.println("Java developer writes java code...");
    }
}
