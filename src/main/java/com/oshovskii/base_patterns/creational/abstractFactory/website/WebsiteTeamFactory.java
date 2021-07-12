package com.oshovskii.base_patterns.creational.abstractFactory.website;

import com.oshovskii.base_patterns.creational.abstractFactory.Developer;
import com.oshovskii.base_patterns.creational.abstractFactory.ProjectManager;
import com.oshovskii.base_patterns.creational.abstractFactory.ProjectTeamFactory;
import com.oshovskii.base_patterns.creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
