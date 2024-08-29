package com.rabbitMQ_Producer_Test.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rabbitMQ_Producer_Test.dto.MessageDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RabbitMqProducerService {
	
	private final RabbitTemplate rabbitTemplate;
	
	@Value("${rabbitmq.exchange.name}")
	private String exchangeName;
	
	@Value("${rabbitmq.routing.key}")
	private String routingKey;

	public void sendMessage(MessageDTO dto) {
		rabbitTemplate.convertAndSend(exchangeName, routingKey, dto);
	}
}
