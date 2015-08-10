package com.design.pattern;

import com.design.pattern.decorator.RedShapeDecorator;
import com.design.pattern.shape.Circle;
import com.design.pattern.shape.Rectangle;
import com.design.pattern.shape.Shape;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		Shape circle = new Circle();

		RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
		RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

		circle.draw();
		redCircle.draw();
		redRectangle.draw();
	}
}
