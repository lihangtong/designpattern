package com.developerx.designpattern.listener;

/**
 * Description: 事件对象
 * All Rights Reserved.
 * @version 1.0  2016年11月25日 下午9:11:44  by 李航通（ht.li01@zuche.com）创建
 */
public class Event {
	
	private EventType eventType;

	private Object object;
	
	public Event (EventType evenType) {
		this.eventType = evenType;
	}
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
	
}
