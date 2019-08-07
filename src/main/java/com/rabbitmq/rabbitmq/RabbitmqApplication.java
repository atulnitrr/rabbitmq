package com.rabbitmq.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rabbitmq.rabbitmq.model.SimpleMessage;


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
		final SimpleMessage message = new SimpleMessage();
		message.setName("second");
		message.setDescription("simple description");
		rabbitTemplate.convertAndSend("MyTopicExchange", "topic", message);
	}
}
