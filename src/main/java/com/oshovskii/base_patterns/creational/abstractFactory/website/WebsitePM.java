package com.oshovskii.base_patterns.creational.abstractFactory.website;

import com.oshovskii.base_patterns.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
