package com.rabbitMQ_Consumer_Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RabbitMqConsumerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqConsumerTestApplication.class, args);
	}

}
