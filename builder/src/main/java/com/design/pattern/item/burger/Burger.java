package com.design.pattern.item.burger;

import com.design.pattern.item.Item;
import com.design.pattern.packing.Packing;
import com.design.pattern.packing.Wrapper;

/**
 * Created by jason on 15/4/24.
 */
public abstract class Burger implements Item {


	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
