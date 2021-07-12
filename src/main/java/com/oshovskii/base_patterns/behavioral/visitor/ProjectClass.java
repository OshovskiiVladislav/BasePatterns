package com.oshovskii.base_patterns.behavioral.visitor;

public class ProjectClass implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
