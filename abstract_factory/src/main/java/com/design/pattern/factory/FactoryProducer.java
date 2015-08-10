package com.design.pattern.factory;

/**
 * Created by jason on 15/4/22.
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryType) {
		if (factoryType.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		} else if (factoryType.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else {
			return null;
		}
	}
}
