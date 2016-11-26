package com.developerx.designpattern.facade;

/**
 * Description: Facade模式
 * 		为一个复杂子系统提供一个简单接口
 * 		提高子系统的独立性
 * 		在层次化结构中，可以使用Facade模式定义系统中每一层的入口。
 * 		
 * 		初学者往往以为通过继承一个门面类便可在子系统中加入新的行为，这是错误的。门面模式的用意是为子系统提供一个集中化和简化的沟通管道，而不能向子系统加入新的行为
 * All Rights Reserved.
 * @version 1.0  2016年11月26日 上午8:25:31  by 李航通（ht.li01@zuche.com）创建
 */
public class Client {
	
	public static void main(String[] args) {
		new ComputerFacade().start();
	}
	
}
