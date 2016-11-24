package com.developerx.designpattern.factory;

/**
 * Description: 多个工厂方法
 * All Rights Reserved.
 * @version 1.0  2016年11月24日 下午5:01:25  by HT.LI 创建
 */
public class FactoryMethodB {
	
	public static Car getAudi () {
		return new AudiCar ();
	}
	
	public static Car getBenz () {
		return new BenzCar ();
	}
	
	public static Car getBmw () {
		return new BmwCar ();
	}
	
}
