package com.javadevsguide.springframework.di.service.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.javadevsguide.springframework.di.MessageService;

@Component
public class SetterBasedInjection {
	
	private MessageService messageservice;
	
	
	@Autowired
	@Qualifier("TwitterService")
	public void setMessageSerivec(MessageService messageservice) {
		this.messageservice = messageservice;
		
	}
	
	public void processMesg(String message) {
		messageservice.setMeg(message);
		
	}
	

}
