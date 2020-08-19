package com.ru.alex.aasmc;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Sleep());
        developer.executeActivity();

        developer.setActivity(new Train());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleep());
        developer.executeActivity();
    }
}
