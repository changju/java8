package com.study.java8.chap4;

public class Greeting {
	private String name;

	public Greeting() {

	}

	public Greeting(String name) {
		this.name = name;

	}

	public String hello(String name) {
		return "hello " + name;
	}
	
	public String getName() {
		return name;
	}


	public static String hi(String name) {
		return "hi" + name;  
	}

}
