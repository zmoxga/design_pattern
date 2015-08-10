package com.design.pattern.item.coolDrink;

/**
 * Created by jason on 15/4/24.
 */
public class Coke extends CoolDrink {
	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Coke";
	}
}
