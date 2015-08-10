package com.design.pattern.factory;

import com.design.pattern.entity.color.Color;
import com.design.pattern.entity.shape.Circle;
import com.design.pattern.entity.shape.Rectangle;
import com.design.pattern.entity.shape.Shape;
import com.design.pattern.entity.shape.Square;

/**
 * Created by jason on 15/4/22.
 */
public class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;

	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
