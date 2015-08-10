package com.design.pattern.decorator;

import com.design.pattern.shape.Shape;

public class ShapeDecorator {
	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}
}
