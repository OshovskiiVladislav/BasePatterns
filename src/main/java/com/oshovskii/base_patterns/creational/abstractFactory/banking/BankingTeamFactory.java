package com.oshovskii.base_patterns.creational.abstractFactory.banking;

import com.oshovskii.base_patterns.creational.abstractFactory.Developer;
import com.oshovskii.base_patterns.creational.abstractFactory.ProjectManager;
import com.oshovskii.base_patterns.creational.abstractFactory.ProjectTeamFactory;
import com.oshovskii.base_patterns.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
