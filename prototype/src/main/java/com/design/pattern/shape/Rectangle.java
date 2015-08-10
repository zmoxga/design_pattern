package com.design.pattern.shape;

/**
 * Created by jason on 15/4/27.
 */
public class Rectangle extends Shape {
	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}