package com.oshovskii.base_patterns.creational.abstractFactory.banking;

import com.oshovskii.base_patterns.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
