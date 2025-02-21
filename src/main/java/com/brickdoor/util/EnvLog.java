package com.brickdoor.util;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // Marks this as a Spring Bean

public class EnvLog {

    //Inject values from application.properties or .env
    @Value("${DB_USERNAME}")
    private String dbUsername;

    @Value("${DB_PASSWORD}")
    private String dbPassword;


    @PostConstruct
    public void logEnvironmentVariables() {
        System.out.println("Database Username:" + dbUsername);
        System.out.println("Database Password:" + dbPassword);
    }
}
