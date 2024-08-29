package com.rabbitMQ_Consumer_Test.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.rabbitMQ_Consumer_Test.dto.MessageDTO;

@Service
public class RabbitMqConsumerService {

	@RabbitListener(queues = "${rabbitmq.queue.name}")
	public void receivedMessage(MessageDTO dto) {
		System.out.println("================ Receieved Message : " + dto.toString());
	}
}
