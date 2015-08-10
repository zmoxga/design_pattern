package com.design.pattern;

import org.junit.Test;

public class ProxyImageTest {

	@Test
	public void testProxyImage() {
		Image image = new ProxyImage("test_10mb.jpg");

		image.display();
		System.out.println("");

		image.display();
	}
}