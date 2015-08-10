package com.design.pattern;

/**
 * Created by jason on 15/4/27.
 */
public abstract class Shape {
	protected DrawAPI drawAPI;

	public Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();

}
