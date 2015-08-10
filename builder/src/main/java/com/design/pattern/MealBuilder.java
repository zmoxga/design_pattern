package com.design.pattern;

import com.design.pattern.item.burger.ChickenBurger;
import com.design.pattern.item.burger.VegBurger;
import com.design.pattern.item.coolDrink.Coke;
import com.design.pattern.item.coolDrink.Pepsi;

/**
 * Created by jason on 15/4/24.
 */
public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
