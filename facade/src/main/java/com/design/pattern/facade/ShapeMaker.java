package com.design.pattern.facade;

import com.design.pattern.shape.Circle;
import com.design.pattern.shape.Rectangle;

public class ShapeMaker {
	private Circle circle;
	private Rectangle rectangle;

	public ShapeMaker() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}
}
