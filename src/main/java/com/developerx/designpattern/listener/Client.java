package com.developerx.designpattern.listener;

public class Client {
	
	public static void main(String[] args) {
		new EventSource().notifyListener(new Event(EventType.CONNECTION));
	}
	
}
