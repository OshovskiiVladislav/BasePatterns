package com.oshovskii.base_patterns.behavioral.visitor;

public interface Developer {
    public void create(ProjectClass projectClass);

    public void create(Database database);

    public void create(Test test);

}
