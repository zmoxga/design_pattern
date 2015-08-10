package com.design.pattern.item.coolDrink;

/**
 * Created by jason on 15/4/24.
 */
public class Pepsi extends CoolDrink {
	@Override
	public float price() {
		return 35.0f;
	}

	@Override
	public String name() {
		return "Pepsi";
	}
}
