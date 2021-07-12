package com.oshovskii.base_patterns.creational.abstractFactory.website;

import com.oshovskii.base_patterns.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes Php code...");
    }
}
