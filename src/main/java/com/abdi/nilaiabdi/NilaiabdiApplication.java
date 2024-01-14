package com.abdi.nilaiabdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NilaiabdiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NilaiabdiApplication.class, args);
	}
        
        @Bean
        public RestTemplate restTemplate(){
            return new RestTemplate();
        }
}