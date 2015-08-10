package com.design.pattern.item.coolDrink;

import com.design.pattern.item.Item;
import com.design.pattern.packing.Bottle;
import com.design.pattern.packing.Packing;

/**
 * Created by jason on 15/4/24.
 */
public abstract class CoolDrink implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
