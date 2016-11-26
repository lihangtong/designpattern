package com.developerx.designpattern.facade;

/**
 * Description: 在门面模式中，通常只需要一个门面类，并且此门面类只有一个实例，换言之它是一个单例类。
 * 
 * 门面(Facade)角色：客户端可以调用这个角色的方法。此角色知晓相关的(一个或者多个)子系统的功能和责任。在正常情况下，本角色会将所有从客户端发来的请求委派到相应的子系统去。
 * 子系统(subsystem)角色：可以同时有一个或者多个子系统。每一个子系统都不是一个单独的类，而是一个类的集合。每一个子系统都可以被客户端直接调用，或者被门面角色调用。
 * All Rights Reserved.
 * @version 1.0  2016年11月26日 上午8:26:59  by 李航通（ht.li01@zuche.com）创建
 */
public class ComputerFacade {
	
	private Cpu cpu;
	
	private Memory memory;
	
	private Power power;
	
	public ComputerFacade () {
		cpu = new Cpu();
		memory = new Memory();
		power = new Power();
	}
	
	public void start () {
		power.start();
		memory.init();
		cpu.init();
	}
	
	public void shutdown () {
		cpu.close();
		memory.close();
		power.shutdown();
	}
	
	
}
