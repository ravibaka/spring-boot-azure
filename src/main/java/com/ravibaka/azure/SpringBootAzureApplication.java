package com.ravibaka.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAzureApplication {
    @GetMapping("/welcome")
    public String welcome() {
        return "Your app deployed successfully, Welcome to Azure";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAzureApplication.class, args);
    }

}
