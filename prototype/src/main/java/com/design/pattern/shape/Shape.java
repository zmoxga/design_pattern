package com.design.pattern.shape;

/**
 * Created by jason on 15/4/27.
 */
public abstract class Shape implements Cloneable {
	protected String id;
	protected String type;

	public abstract void draw();
	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
