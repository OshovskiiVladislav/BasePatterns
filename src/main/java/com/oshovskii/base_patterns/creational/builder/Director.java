package com.oshovskii.base_patterns.creational.builder;

public class Director {
    WebsiteBuilder builder;

    public void setWebsiteBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    public Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        Website website = builder.getWebsite();

        return website;
    }
}
