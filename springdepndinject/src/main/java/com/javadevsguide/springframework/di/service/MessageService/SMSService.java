package com.javadevsguide.springframework.di.service.MessageService;

import org.springframework.stereotype.Service;

import com.javadevsguide.springframework.di.MessageService;

@Service("SMSService")
public class SMSService implements MessageService {

	public void setMeg(String message) {

		System.out.println(message);

	}
	}
