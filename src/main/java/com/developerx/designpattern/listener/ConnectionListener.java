package com.developerx.designpattern.listener;

public class ConnectionListener implements Listener {

	public void process(Event event) {
		if (event.getEventType() != EventType.CONNECTION) {
			return;
		}
		System.out.println("Connection listener process.");
	}

}
