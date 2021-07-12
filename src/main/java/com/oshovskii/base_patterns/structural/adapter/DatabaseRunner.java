package com.oshovskii.base_patterns.structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabese();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
