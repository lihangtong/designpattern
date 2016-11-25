package com.developerx.designpattern.builder;

public class AnimalBuidler implements Builder {

	public void builderHead() {
		System.out.println("Animal Head.");
	}

	public void builderBody() {
		System.out.println("Animal Body.");
	}

	public void builderFoot() {
		System.out.println("Animal Foot.");
	}

}
