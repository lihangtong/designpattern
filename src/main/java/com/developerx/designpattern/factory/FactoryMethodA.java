package com.developerx.designpattern.factory;

import com.developerx.designpattern.factory.Car.CarType;

/**
 * Description: 单个工厂方法
 * All Rights Reserved.
 * @version 1.0  2016年11月24日 下午5:00:58  by HT.LI 创建
 */
public class FactoryMethodA {
	
	public static Car getCar(CarType carType) {
		Car car = null;
		if (carType == CarType.Audi) {
			car = new AudiCar ();
		} else if (carType == CarType.Benz) {
			car = new BenzCar ();
		} else if (carType == CarType.Bmw) {
			car = new BmwCar ();
		}
		return car;
	}
	
}
