package com.design.pattern.entity.shape;

import com.design.pattern.entity.shape.Shape;

/**
 * Created by jason on 15/4/21.
 */
public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
