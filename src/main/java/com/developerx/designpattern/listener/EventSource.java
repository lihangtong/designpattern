package com.developerx.designpattern.listener;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 事件源
 * All Rights Reserved.
 * @version 1.0  2016年11月25日 下午9:10:59  by 李航通（ht.li01@zuche.com）创建
 */
public class EventSource {
	
	private static List<Listener> listenerList = new ArrayList<Listener>();
	
	static {
		listenerList.add(new ConnectionListener());
		listenerList.add(new OpenListener());
		listenerList.add(new CloseListener());
	}
	
	public void addListener (Listener listener) {
		listenerList.add(listener);
	}
	
	public void removeListener (Listener listener) {
		listenerList.remove(listener);
	}
	
	public void notifyListener (Event event) {
		for (Listener listener : listenerList) {
			listener.process(event);
		}
	}
	
}
