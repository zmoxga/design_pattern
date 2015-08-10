package com.design.pattern.entity.impl;

import com.design.pattern.entity.Shape;

/**
 * Created by jason on 15/4/21.
 */
public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
