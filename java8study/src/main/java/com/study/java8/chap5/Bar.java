package com.study.java8.chap5;

public interface Bar extends Foo{
	
	// 인터페이스를 상속받는 인터페이스에서 default 메서드를 다시 추상 메소드로 변경할 수 있다
	void printNameUpperCase();
}
