package com.example.consumerest;

import com.example.consumerest.entity.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumeRestApplication {
  private static   final Logger logger=LoggerFactory.getLogger(ConsumeRestApplication.class);
    @Bean
    public RestTemplate getBean(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Message quote = restTemplate.getForObject("http://localhost:8080/get", Message.class);
            logger.info(quote.toString());
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsumeRestApplication.class, args);
    }

}
