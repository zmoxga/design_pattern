package com.design.pattern.item.burger;

/**
 * Created by jason on 15/4/24.
 */
public class ChickenBurger extends Burger {

	@Override
	public float price() {
		return 50.5f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}
}
