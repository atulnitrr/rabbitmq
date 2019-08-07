package com.rabbitmq.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqApplication.class, args);
		System.out.println("App is runing -->");
	}


	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public void run(final String... args) throws Exception {
		rabbitTemplate.convertAndSend("TestExchange", "testRouting", "Testing exchnage data ");
	}
}
