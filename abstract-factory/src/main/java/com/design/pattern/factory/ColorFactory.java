package com.design.pattern.factory;

import com.design.pattern.entity.color.Blue;
import com.design.pattern.entity.color.Color;
import com.design.pattern.entity.color.Green;
import com.design.pattern.entity.color.Red;
import com.design.pattern.entity.shape.Shape;

/**
 * Created by jason on 15/4/22.
 */
public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("Red")) {
			return new Red();
		} else if (color.equalsIgnoreCase("Green")) {
			return new Green();
		} else if (color.equalsIgnoreCase("Blue")) {
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}
}
