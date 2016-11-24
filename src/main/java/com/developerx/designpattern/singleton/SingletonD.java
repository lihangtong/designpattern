package com.developerx.designpattern.singleton;

/**
 * Description: 线程安全，采用静态内部类
 * All Rights Reserved.
 * @version 1.0  2016年11月24日 下午4:39:42  by HT.LI 创建
 */
public class SingletonD {
	
	private static class SingletonFactory {
		private static SingletonD instance = new SingletonD ();
	}
	
	private SingletonD () {}
	
	public static SingletonD getInstance () {
		return SingletonFactory.instance;
	}
	
}
