package ru.netology.bff;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class BffServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BffServiceApplication.class, args);
        System.out.println("The BFF-Service is running!");
    }

//    @Bean
//    public WebClient.Builder webClientBuilder() {
//        return WebClient.builder();
//    }
}