package com.developerx.designpattern.adapter;

/**
 * Description: 目标接口的适配类
 * All Rights Reserved.
 * @version 1.0  2016年11月26日 上午8:07:57  by 李航通（ht.li01@zuche.com）创建
 */
public class Adapter implements Target {
	
	private Adaptee adaptee = new Adaptee();
	
	public void request () {
		adaptee.specifyRequest();
	}
	
}
