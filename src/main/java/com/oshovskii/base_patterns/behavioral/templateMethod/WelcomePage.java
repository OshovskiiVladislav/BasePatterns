package com.oshovskii.base_patterns.behavioral.templateMethod;

public class WelcomePage extends WebsiteTemplate{

    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
