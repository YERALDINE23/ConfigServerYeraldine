package com.example.configserveryeraldine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerYeraldineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerYeraldineApplication.class, args);
    }

}
