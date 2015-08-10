package com.design.pattern.entity.shape;

import com.design.pattern.entity.shape.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw(){
		System.out.println("Inside Rectangle::draw() method.");
	}
}
