package com.oshovskii.base_patterns.structural.bridge;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes c++ code...");
    }
}
