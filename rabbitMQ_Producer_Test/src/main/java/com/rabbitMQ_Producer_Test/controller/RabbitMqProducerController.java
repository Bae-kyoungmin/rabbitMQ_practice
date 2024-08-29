package com.rabbitMQ_Producer_Test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitMQ_Producer_Test.dto.MessageDTO;
import com.rabbitMQ_Producer_Test.service.RabbitMqProducerService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class RabbitMqProducerController {

	private final RabbitMqProducerService rabbitMqProducerService;
	
	@PostMapping("/send/message")
	public ResponseEntity<String> send(@RequestBody MessageDTO dto) {
		System.out.println("test = = = = > " + dto.toString());
		rabbitMqProducerService.sendMessage(dto);
		return ResponseEntity.ok("===== Send Complete !!  ====="); 
	}
}
