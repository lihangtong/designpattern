package com.developerx.designpattern.singleton;

/**
 * Description: 非线程安全的单例
 * All Rights Reserved.
 * @version 1.0  2016年11月24日 下午4:34:21  by HT.LI 创建
 */
public class SingletonA {
	
	private static SingletonA instance = null;
	
	private SingletonA () {}
	
	public static SingletonA getInstance () {
		if (null == instance) {
			instance = new SingletonA ();
		}
		return instance;
	}
	
	
}
