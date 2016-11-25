package com.developerx.designpattern.listener;

public class CloseListener implements Listener {

	public void process(Event event) {
		if (event.getEventType() != EventType.CLOSE) {
			return;
		}
		System.out.println("Close Listener process.");
	}

}
