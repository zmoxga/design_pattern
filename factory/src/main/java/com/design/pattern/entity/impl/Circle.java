package com.design.pattern.entity.impl;

import com.design.pattern.entity.Shape;

/**
 * Created by jason on 15/4/21.
 */
public class Circle implements Shape {
	@Override
	public void draw(){
		System.out.println("Inside Circle::draw() method.");
	}
}
