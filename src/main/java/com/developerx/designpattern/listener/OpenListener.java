package com.developerx.designpattern.listener;

public class OpenListener implements Listener {

	public void process(Event event) {
		if (event.getEventType() != EventType.OPEN) {
			return;
		}
		System.out.println("Open listener process.");
	}

}
