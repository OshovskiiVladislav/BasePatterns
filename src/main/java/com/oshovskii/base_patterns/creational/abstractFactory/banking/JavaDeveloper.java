package com.oshovskii.base_patterns.creational.abstractFactory.banking;

import com.oshovskii.base_patterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
