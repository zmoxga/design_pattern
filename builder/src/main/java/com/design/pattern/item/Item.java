package com.design.pattern.item;

import com.design.pattern.packing.Packing;

/**
 * Created by jason on 15/4/24.
 */
public interface Item {
	public String name();

	public Packing packing();

	public float price();

}
