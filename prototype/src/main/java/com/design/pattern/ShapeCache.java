package com.design.pattern;

import com.design.pattern.shape.Circle;
import com.design.pattern.shape.Rectangle;
import com.design.pattern.shape.Shape;
import com.design.pattern.shape.Square;

import java.util.Hashtable;

/**
 * Created by jason on 15/4/27.
 */
public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	public static final String SHAPE_TYPE_CIRCLE = "circle";
	public static final String SHAPE_TYPE_SQUARE = "square";
	public static final String SHAPE_TYPE_RECTANGLE = "rectangle";

	public static Shape getShape(String shapeType) {
		Shape cacheShape = shapeMap.get(shapeType);
		return (Shape) cacheShape.clone();
	}

	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId(SHAPE_TYPE_CIRCLE);
		shapeMap.put(circle.getId(), circle);

		Square square = new Square();
		square.setId(SHAPE_TYPE_SQUARE);
		shapeMap.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId(SHAPE_TYPE_RECTANGLE);
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
