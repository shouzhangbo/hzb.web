package com.my.hzb.data.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


public class MqReceiver {

	public void onMessage(String message){
		System.out.println(message);
//		TextMessage textMessage = (TextMessage) message;
//		try {
//			System.out.println(textMessage.getText());
//		} catch (JMSException e) {
//			e.printStackTrace();
//		}
	}
}
