package com.design.pattern;

import com.design.pattern.shape.Shape;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeCacheTest {

	@Test
	public void testShapeCache(){
		ShapeCache.loadCache();

		Shape clonedShape = (Shape)ShapeCache.getShape(ShapeCache.SHAPE_TYPE_RECTANGLE);
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape(ShapeCache.SHAPE_TYPE_CIRCLE);
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape(ShapeCache.SHAPE_TYPE_SQUARE);
		System.out.println("Shape : " + clonedShape3.getType());

	}
}