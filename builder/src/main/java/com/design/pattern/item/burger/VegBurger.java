package com.design.pattern.item.burger;

/**
 * Created by jason on 15/4/24.
 */
public class VegBurger extends Burger {
	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "Veg Burger";
	}
}
