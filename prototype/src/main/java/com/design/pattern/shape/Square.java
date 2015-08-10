package com.design.pattern.shape;

/**
 * Created by jason on 15/4/27.
 */
public class Square extends Shape {
	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
