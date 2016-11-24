package com.developerx.designpattern.singleton;

/**
 * Description: 线程安全版本单例
 * All Rights Reserved.
 * @version 1.0  2016年11月24日 下午4:37:43  by HT.LI 创建
 */
public class SingletonB {
	
	private static SingletonB instance = null;
	
	private SingletonB () {}
	
	public static synchronized SingletonB getInstance () {
		if (null == instance) {
			instance = new SingletonB();
		}
		return instance;
	}
	
}
