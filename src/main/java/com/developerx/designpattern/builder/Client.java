package com.developerx.designpattern.builder;

public class Client {
	
	public static void main(String[] args) {
		new Director(new ManBuilder()).construct();
	}
	
}
