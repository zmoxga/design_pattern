package com.design.pattern.factory;

import com.design.pattern.entity.color.Color;
import com.design.pattern.entity.shape.Shape;

/**
 * Created by jason on 15/4/22.
 */
public abstract class AbstractFactory {

	public abstract Color getColor(String color);

	public abstract Shape getShape(String shapeType);
}
