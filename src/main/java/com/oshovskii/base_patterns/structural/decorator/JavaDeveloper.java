package com.oshovskii.base_patterns.structural.decorator;

public class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Write Java code.";
    }
}
