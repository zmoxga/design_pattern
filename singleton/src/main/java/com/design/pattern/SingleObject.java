package com.design.pattern;

/**
 * Created by jason on 15/4/23.
 */
public class SingleObject {
	private static SingleObject instance;

	private SingleObject() {
	}

	public static SingleObject getInstance() {
		if(instance==null){
			synchronized (SingleObject.class){
				instance=new SingleObject();
			}
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
