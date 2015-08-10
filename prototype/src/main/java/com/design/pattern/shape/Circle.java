package com.design.pattern.shape;

/**
 * Created by jason on 15/4/27.
 */
public class Circle extends Shape{

	public Circle(){
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
