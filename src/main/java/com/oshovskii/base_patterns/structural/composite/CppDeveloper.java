package com.oshovskii.base_patterns.structural.composite;

public class CppDeveloper implements Developer{
    @Override
    public void createProject() {
        System.out.println("C++ developer writes c++ code...");
    }
}
