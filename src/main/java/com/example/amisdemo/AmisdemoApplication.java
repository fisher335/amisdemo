package com.example.amisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AmisdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmisdemoApplication.class, args);
    }

}
