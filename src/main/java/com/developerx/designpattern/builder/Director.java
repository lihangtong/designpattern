package com.developerx.designpattern.builder;

/**
 * Description: 指挥者。构建一个使用Builder接口的对象。它主要是用于创建一个复杂的对象，
 * 它主要有两个作用，一是：隔离了客户与对象的生产过程，二是：负责控制产品对象的生产过程。
 * All Rights Reserved.
 * @version 1.0  2016年11月25日 下午9:26:37  by 李航通（ht.li01@zuche.com）创建
 */
public class Director {
	
	private Builder builder;
	
	public Director (Builder builder) {
		this.builder = builder;
	}
	
	
	public Builder construct () {
		builder.builderHead();
		builder.builderBody();
		builder.builderFoot();
		return builder;
	}
	
}
