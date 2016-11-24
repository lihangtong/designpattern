package com.developerx.designpattern.singleton;

/**
 * Description: 线程安全，直接new一个静态对象
 * All Rights Reserved.
 * @version 1.0  2016年11月24日 下午4:38:51  by HT.LI 创建
 */
public class SingletonC {
	
	private static SingletonC instance = new SingletonC ();
	
	private SingletonC () {}
	
	public static SingletonC getInstance () {
		return SingletonC.instance;
	}
	
}
