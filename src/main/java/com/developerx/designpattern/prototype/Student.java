package com.developerx.designpattern.prototype;

import java.util.Date;

/**
 * Description: 普通的克隆，浅复制
 * All Rights Reserved.
 * @version 1.0  2016年11月25日 下午10:04:38  by 李航通（ht.li01@zuche.com）创建
 */
public class Student implements  Cloneable {

	private Integer id;
	
	private String name;
	
	private String password;
	
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
