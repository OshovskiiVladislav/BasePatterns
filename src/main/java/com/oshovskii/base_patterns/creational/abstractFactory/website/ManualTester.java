package com.oshovskii.base_patterns.creational.abstractFactory.website;

import com.oshovskii.base_patterns.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
