package com.design.pattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class BridgePatternTest {

	@Test
	public void testDrawCircle() throws Exception {
		Shape redCircle = new Circle(100,100, 10, new RedCircle());
		Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}